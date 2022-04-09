package web.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.Dashboard;

public class DashboardSteps {
    Dashboard dashboard = new Dashboard();

    @Given("I have been in Dashboard as Admin")
    public void iHaveBeenInDashboardAsAdmin() {
        dashboard.logInAsAdmin();
        dashboard.validateOnAdminPage();
    }

    @When("I click on PIM menu")
    public void iClickOnMenu() {
        dashboard.clickPIM();
    }

    @Then("I can see the list of all users")
    public void iCanSeeTheListOfAllUsers() {
        dashboard.validateListOfUsers();
    }

    @When("I click on Employement Status filter")
    public void iClickOnEmployementStatusFilter() {
        dashboard.clickOnEmploymentStatus();
    }

    @And("I select Full-Time Permanent")
    public void iSelectFullTimePermanent() {
        dashboard.selectEmploymentStatus();
    }

    @And("I click on Search button")
    public void iClickOnSearchButton() {
        dashboard.clickOnSearchBtn();
    }

    @Then("I can see the user list by Employment Status")
    public void iCanSeeTheUserListByEmploymentStatus() {
        dashboard.validateEmploymentStatusFilter();
    }


}
