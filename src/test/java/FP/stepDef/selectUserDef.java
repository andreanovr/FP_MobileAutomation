package FP.stepDef;

import FP.pages.selectUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class selectUserDef {

    @Given("user is on select user page")
    public void userIsOnSelectUserPage() {
        selectUserPage.validateOnPage();
    }

    @And("user choose Pencari Kos")
    public void pencariKosButton() {
        selectUserPage.pencariKosButtonClick();
    }

    @And("user choose Penyewa Kos")
    public void penyewaKosButton() {
        selectUserPage.penyewaKosButtonClick();
    }
}
