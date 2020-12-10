package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import ui.UI;

public class ProductPage extends AbstractPage {
    @FindBy(xpath = "//div[@id='productPrice']//span")
    private WebElement productPriceElement;

    @FindBy(xpath = "//button[@id=\"buttonPanel_AddToCartButton\"]")
    private WebElement addToCartElement;

    private WebDriver driver;

    public ProductPage(UI ui) {
        super(ui);
        driver = ui.getDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @Override
    public String getCurrentPage() {
        return "Product";
    }

    public String getProductPrice() {
        return productPriceElement.getText();
    }

    public CartPage addToCart() {
        addToCartElement.click();
        return new CartPage(ui);
    }
}
