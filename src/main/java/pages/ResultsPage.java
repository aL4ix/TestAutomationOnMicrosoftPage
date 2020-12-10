package pages;

import ui.UI;

import java.util.ArrayList;

public class ResultsPage extends AbstractPage {
    String ITEMS_PRICES = "(//div[contains(@class, 'c-carousel')])[1]//span[@itemprop='price']";
    String RESULT_ITEM = "((//div[contains(@class, 'c-carousel')])[1]//li//a)[%d]";
    String CANCEL_SIGNUP_BUTTON = "//div[contains(@class, 'glyph-cancel')]";

    public ResultsPage(UI ui) {
        super(ui);
    }

    @Override
    public String getCurrentPage() {
        return "Results";
    }

    public ArrayList<String> getItemPrices() {
        ArrayList<String> itemPrices = ui.getAttributeOfElements(ITEMS_PRICES, "");
        return itemPrices;
    }

    public ProductPage selectItem(int item) {
        ui.click(String.format(RESULT_ITEM, item));
        ui.click(CANCEL_SIGNUP_BUTTON);
        return new ProductPage(ui);
    }
}
