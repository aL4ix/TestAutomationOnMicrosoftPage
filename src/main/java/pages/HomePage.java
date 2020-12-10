package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import ui.UI;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AbstractPage {
    String WINDOWS_MENU = "//*[@id=\"shellmenu_2\"]";
    String ALL_MENU_ITEMS = "//*[@id=\"uhf-g-nav\"]//a";
    String SEARCH_BUTTON = "//*[@id=\"search\"]";
    String SEARCH_INPUT = "//*[@id=\"cli_shellHeaderSearchInput\"]";
    String STAY_ON_PAGE_BUTTON = "//*[@id=\"R1MarketRedirect-close\"]";

    public HomePage(UI ui) {
        super(ui);
    }

    @Override
    public String getCurrentPage() {
        return "Home";
    }

    public HomePage openHomePage(String webPage) {
        openWebPage(webPage);
        return this;
    }

    public void assertAllMenuItemsArePresent(List<String> menuItems) {
        ArrayList<String> pageMenuItems = ui.getAttributeOfElements(ALL_MENU_ITEMS, "");
        for(String menuItem : menuItems) {
            Assert.assertTrue(String.format("Menu item is not present %s", menuItem), pageMenuItems.contains(menuItem));
        }
    }

    public WindowsPage goToWindowsSection() {
        ui.click(WINDOWS_MENU);
        return new WindowsPage(ui);
    }

    public ResultsPage searchFor(String textToSearch) {
        ui.click(SEARCH_BUTTON);
        ui.sendKeys(SEARCH_INPUT, textToSearch);
        ui.sendKeys(SEARCH_INPUT, Keys.ENTER);
        ui.click(STAY_ON_PAGE_BUTTON);
        if(!ui.invisibilityOfElement(STAY_ON_PAGE_BUTTON)) {
            ui.click(STAY_ON_PAGE_BUTTON);
        }
        return new ResultsPage(ui);
    }
}
