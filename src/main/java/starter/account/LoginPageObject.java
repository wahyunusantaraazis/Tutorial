package starter.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPageObject extends PageObject {

    // field username
    @FindBy(xpath = "//input[@id='uid']")
    WebElementFacade FieldUsername;
    public void enterFieldUsername(String username){
        FieldUsername.sendKeys("username");
    }

    // field password
    @FindBy(xpath = "//input[@id='pwd']")
    WebElementFacade FieldPassword;
    public void enterFieldPassword(String password){
        FieldPassword.sendKeys("password");
    }

    // button sign in
    @FindBy(xpath = "//button[@id='login-button']")
    WebElementFacade ButtonSignIn;
    public void clickButtonSignIn(){
        ButtonSignIn.click();
    }

    // button sign in
    @FindBy(xpath = "//a[@id='user-dropdown']")
    WebElementFacade Dashboard;
    public void validateDashboard(){
        Dashboard.shouldBePresent();
    }

}
