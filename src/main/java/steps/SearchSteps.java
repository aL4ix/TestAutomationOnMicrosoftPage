package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ResultsPage;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

public class SearchSteps {
    private final TestContext testContext;
    private String savedFirstNewsEntry;
    private Scenario scenario;
    private ResultsPage resultsPage;
    private String firstStoredPrice;
    private ProductPage productPage;
    private String secondStoredPrice;
    private CartPage cartPage;

    public SearchSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("I search for {string}")
    public void iSearchForSomething(String textToSearch) {
        HomePage homePage = new HomePage(testContext.getUi());
        resultsPage = homePage.searchFor(textToSearch);
    }

    @Then("Return the price of the {int} first elements listed in Software result list")
    public void returnThePriceOfTheFirstElementsListedInSoftwareResultList(Integer numOfItems) {
        ArrayList<String> itemPrices = resultsPage.getItemPrices();
        int num = 0;
        for(String itemPrice : itemPrices) {
            scenario.write(String.format("Price of product number %d: %s", num, itemPrice));
            if(++num >= numOfItems) {
                break;
            }
        }
    }

    @Then("Store the price of the first product")
    public void storeThePriceOfTheFirstProduct() {
        firstStoredPrice = resultsPage.getItemPrices().get(0);
        scenario.write(String.format("Storing: %s", firstStoredPrice));
    }

    @Given("I enter the details page on the first product")
    public void iEnterTheDetailsPageOnTheFirstProduct() {
        productPage = resultsPage.selectItem(1);
    }
    @Then("Validate product price and store it")
    public void validateProductPriceAndStoreIt() {
        secondStoredPrice = productPage.getProductPrice();
        scenario.write(String.format("Storing: %s", secondStoredPrice));
        Assert.assertEquals("Prices are different", firstStoredPrice, secondStoredPrice);
    }

    @When("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        cartPage = productPage.addToCart();
    }
    @Then("Verify all 3 price amounts are the same")
    public void verifyAll3PriceAmountsAreTheSame() {
        String unitPrice = cartPage.getUnitPrice();
        // I don't think we need the next line since we already verified first and second prices are the same
        Assert.assertEquals("First and Second prices are different", firstStoredPrice, secondStoredPrice);
        Assert.assertEquals("Third price is different", firstStoredPrice, unitPrice);
    }

    @When("I select {string} products")
    public void iSelectNProducts(String numOfProducts) {
        cartPage.selectNProducts(numOfProducts);
    }

    @Then("Validate total amount is unit price by {string}")
    public void validateTotalAmount(String by) throws ParseException {
        BigDecimal total = parsePrice(cartPage.getTotalPrice(), Locale.US);
        BigDecimal unitPrice = parsePrice(firstStoredPrice, Locale.US);
        Assert.assertEquals("Prices are not the same", unitPrice.multiply(new BigDecimal(by)), total);
        scenario.write(String.valueOf(total));
    }

    public static BigDecimal parsePrice(final String amount, final Locale locale) throws ParseException {
        final NumberFormat format = NumberFormat.getNumberInstance(locale);
        if (format instanceof DecimalFormat) {
            ((DecimalFormat) format).setParseBigDecimal(true);
        }
        return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
    }

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    private void embedScreenshot(String name) throws IOException {
        File file = testContext.getUi().getScreenshot();
        scenario.embed(Files.readAllBytes(file.toPath()), "image/png", name);
    }
}

