package pages;

import ui.UI;

public class CartPage extends AbstractPage {
    private String UNIT_PRICE = "//div[@class=\"item-price\"]//span[@itemprop=\"price\"]";
    private String NUM_PRODUCTS_SELECT = "//select";
    private String TOTAL_PRICE = "((//div[@class=\"cart-route-container\"]//section)[2]//span[@itemprop=\"price\"])[last()]";

    public CartPage(UI ui) {
        super(ui);
    }

    @Override
    public String getCurrentPage() {
        return "Cart";
    }

    public String getUnitPrice() {
        return ui.getText(UNIT_PRICE);
    }

    public CartPage selectNProducts(String numOfProducts) {
        ui.selectByVisibleText(NUM_PRODUCTS_SELECT, numOfProducts);
        ui.waitForClickAbilityOfElement(NUM_PRODUCTS_SELECT);
        ui.sleep(5000); //Give time to the price to be updated
        return this;
    }

    public String getTotalPrice() {
        String text = ui.getText(TOTAL_PRICE);
        return text;
    }
}
