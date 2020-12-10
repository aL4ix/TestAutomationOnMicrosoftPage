package pages;

import steps.Windows10MenuSteps;
import ui.UI;

import java.util.ArrayList;

public class WindowsPage extends AbstractPage {
    String WINDOWS10_MENU = "//*[@id=\"c-shellmenu_54\"]";
    String WINDOWS10_MENU_ITEMS = "//div[contains(@class, 'c-uhf-menu')]/button[@data-bi-name='windows 10']/..//a";

    public WindowsPage(UI ui) {
        super(ui);
    }

    @Override
    public String getCurrentPage() {
        return "Windows";
    }

    public WindowsPage openWindows10Menu() {
        ui.click(WINDOWS10_MENU);
        return this;
    }

    public ArrayList<String> getAllWindows10MenuItems() {
        ArrayList<String> menuItems = ui.getAttributeOfElements(WINDOWS10_MENU_ITEMS, "");
        return menuItems;
    }
}
