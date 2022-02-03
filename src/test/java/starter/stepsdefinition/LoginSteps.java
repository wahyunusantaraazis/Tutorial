package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class LoginSteps extends BaseTest {

    @Given("I am already in login page")
    public void iAmAlreadyInLoginPage() {
        login.open();
    }

    @When("I am input username {string}")
    public void iAmInputUsername(String username) {
        login.enterFieldUsername(username);
    }

    @And("I am input password {string}")
    public void iAmInputPassword(String password) {
        login.enterFieldPassword(password);
    }

    @And("I am click button signin")
    public void iAmClickButtonSignin() {
        login.clickButtonSignIn();
    }

    @Then("I am successfully login")
    public void iAmSuccessfullyLogin() {
        login.validateDashboard();
    }
}
