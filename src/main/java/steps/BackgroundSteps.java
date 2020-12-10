package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class BackgroundSteps {
    private final TestContext testContext;
    private Scenario scenario;
    private HomePage homePage;

    public BackgroundSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("I opened {string} page")
    public void iOpenedPage(String webPage) {
        homePage = new HomePage(testContext.getUi());
        homePage.openHomePage(webPage);
    }

    @Then("Validate all main menu items are present")
    public void validateAllMainMenuItemsArePresent() {
        List<String> strings = Arrays.asList("Microsoft 365", "Office", "Windows",
                "Surface", "Xbox", "Deals", "Support");
        homePage.assertAllMenuItemsArePresent(strings);
    }

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void after() throws IOException {
        if (scenario.isFailed()) {
            embedScreenshot("SCENARIO FAILED!");
        }
        testContext.getUi().quit();
    }

    @AfterStep
    public void afterStep() throws IOException {
        embedScreenshot("");
    }

    private void embedScreenshot(String name) throws IOException {
        File file = testContext.getUi().getScreenshot();
        scenario.embed(Files.readAllBytes(file.toPath()), "image/png", name);
    }
}
