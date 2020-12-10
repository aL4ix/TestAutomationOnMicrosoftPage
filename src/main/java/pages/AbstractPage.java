package pages;

import ui.UI;

public abstract class AbstractPage implements CanOpenPage {
    protected final UI ui;

    protected AbstractPage(UI ui) {
        this.ui = ui;
    }

    @Override
    public void openWebPage(String url) {
        ui.get(url);
    }

    public abstract String getCurrentPage();
}
