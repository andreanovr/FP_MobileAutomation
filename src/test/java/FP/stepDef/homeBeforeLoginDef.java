package FP.stepDef;

import FP.pages.homePageBeforeLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class homeBeforeLoginDef {
    @Given("user is on homepage before login")
    public void homepageValidation() throws InterruptedException {
        homePageBeforeLogin.validateOnPage();
    }

    @And("user click profil menu")
    public void profileMenu() throws InterruptedException {
        homePageBeforeLogin.clickProfileMenu();
    }
}
