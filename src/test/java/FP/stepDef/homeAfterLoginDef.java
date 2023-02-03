package FP.stepDef;

import FP.pages.homePageAfterLoginOwner;
import FP.pages.homePageAfterLoginTenants;
import io.cucumber.java.en.Then;

public class homeAfterLoginDef {
    @Then("user is on homepage tenant after login")
    public void homepageValidationTenant() throws InterruptedException {
        homePageAfterLoginTenants.validateOnPage();
    }

    @Then("user is on homepage owner after login")
    public void homepageValidationOwner() throws InterruptedException {
        homePageAfterLoginOwner.validateOnPage();
    }
}
