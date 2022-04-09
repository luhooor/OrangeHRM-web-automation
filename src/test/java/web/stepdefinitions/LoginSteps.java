package web.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.Dashboard;
import web.pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    Dashboard dashboard = new Dashboard();

    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        loginPage.open();
        loginPage.validateOnLoginPage();
    }

    @When("I input username and password")
    public void iInputUsernameAndPassword() {
        loginPage.inputUsername("Admin");
        loginPage.inputPassword("admin123");
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to Admin Dashboard")
    public void iShouldBeRedirectedToAdminDashboard() {
        dashboard.validateOnAdminPage();
    }

    @When("I input {string} as username and {string} as password")
    public void iInputAsUsernameAndAsPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @Then("I should see error message: {string}")
    public void iShouldSeeErrorMessage(String message) {
        loginPage.validateErrorMessageElement();
        loginPage.validateErrorMessageText(message);
    }
}
