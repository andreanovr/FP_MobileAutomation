package FP.stepDef;

import FP.pages.homePage;
import io.cucumber.java.en.Then;

public class homeDef {
    @Then("user is on homepage")
    public void homepageValidation() throws InterruptedException {
        homePage.validateOnPage();
    }
}
