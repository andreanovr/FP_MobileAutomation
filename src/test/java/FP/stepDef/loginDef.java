package FP.stepDef;

import FP.pages.loginPage;
import FP.pages.selectUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class loginDef {
    @And("user input email with {string}")
    public void inputEmailField(String email) throws InterruptedException {
        loginPage.inputEmail(email);
    }

    @And("user is on login page")
    public void userIsOnSelectHomePage() {
        loginPage.validateOnPage();
    }

    @And("user input password with {string}")
    public void inputPasswordField(String password) throws InterruptedException {
        loginPage.inputPassword(password);
    }

    @When("user click on login button")
    public void clickLogin() throws InterruptedException {
        loginPage.clickLogin();
    }
}
