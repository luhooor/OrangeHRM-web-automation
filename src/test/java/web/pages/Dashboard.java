package web.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Dashboard extends PageObject {
    private By adminElement() {
        return By.id("menu_admin_viewAdminModule");
    }

//    steps
    public boolean validateOnAdminPage() {
        return $(adminElement()).isDisplayed();
    }
}
