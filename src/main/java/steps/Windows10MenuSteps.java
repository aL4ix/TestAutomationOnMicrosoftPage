package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.WindowsPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Windows10MenuSteps {
    private final TestContext testContext;
    private Scenario scenario;
    private WindowsPage windowsPage;

    public Windows10MenuSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("I go to Windows section")
    public void iGoToWindowsSection() {
        HomePage homePage = new HomePage(testContext.getUi());
        windowsPage = homePage.goToWindowsSection();
    }

    @When("I click on Windows 10 menu")
    public void iClickOnWindowsMenu() {
        windowsPage.openWindows10Menu();
    }
    @Then("Return all elements in the dropdown")
    public void returnAllElementsInTheDropdown() {
        ArrayList<String> allWindows10MenuItems = windowsPage.getAllWindows10MenuItems();
        scenario.write(String.join("\n", allWindows10MenuItems));
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
