package FP.stepDef;

import FP.pages.profilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class profileDef {

    @And("user is on profil page")
    public void userIsOnSelectHomePage() throws InterruptedException {
        profilePage.validateOnPage();
    }

    @When("user click logout button")
    public void clickLogout() throws InterruptedException {
        profilePage.clickLogout();
    }

    @And("user click logout on popup")
    public void clickLogoutOnPopUp() throws InterruptedException {
        profilePage.clickLogoutOnPopUp();
    }

    @And("user click cancel on popup")
    public void clickCancelOnPopUp() throws InterruptedException {
        profilePage.clickCancelOnPopUp();
    }
}
