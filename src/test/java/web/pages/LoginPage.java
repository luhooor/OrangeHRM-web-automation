package web.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField() {
        return By.id("txtUsername");
    }

    private By passwordField() {
        return By.id("txtPassword");
    }

    private By loginButtonElement() {
        return By.id("btnLogin");
    }

    private By errorMessageElement() {
        return By.id("spanMessage");
    }

//    Steps
    public void openPage() {
        open();
    }

    public boolean validateOnLoginPage() {
        return $(loginButtonElement()).isDisplayed();
    }

    public void inputUsername(String username) {
        $(usernameField()).type(username);
    }

    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    public void clickLoginButton() {
        $(loginButtonElement()).click();
    }

    public boolean validateErrorMessageElement() {
        return $(errorMessageElement()).isDisplayed();
    }

    public boolean validateErrorMessageText(String message) {
        return $(errorMessageElement()).getText().equalsIgnoreCase(message);
    }

}
