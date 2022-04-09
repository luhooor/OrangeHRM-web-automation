package web.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Dashboard extends PageObject {
    LoginPage loginPage = new LoginPage();

    private By adminElement() {
        return By.id("menu_admin_viewAdminModule");
    }

    private By PIMelement() {
        return By.id("menu_pim_viewPimModule");
    }

    private By userTableElement() {
        return By.id("resultTable");
    }

    private By employmentStatusElement() {
        return By.id("empsearch_employee_status");
    }

    private By searchButtonElement() {
        return By.id("searchBtn");
    }

    private By rowEmploymentStatus() {
        return By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[6]");
    }

//    steps
    public boolean validateOnAdminPage() {
        return $(adminElement()).isDisplayed();
    }

    public void logInAsAdmin() {
        loginPage.open();
        loginPage.inputUsername("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLoginButton();
    }

    public void clickPIM() {
        $(PIMelement()).click();
    }

    public boolean validateListOfUsers() {
        return $(userTableElement()).isDisplayed();
    }

    public void clickOnEmploymentStatus() {
        $(employmentStatusElement()).click();
    }

    public void selectEmploymentStatus() {
        $(employmentStatusElement()).select().byValue("3");
    }

    public void clickOnSearchBtn() {
        $(searchButtonElement()).click();
    }

    public boolean validateEmploymentStatusFilter() {
        return $(rowEmploymentStatus()).getText().equalsIgnoreCase("Full-Time Permanent");
    }
}
