package FP.pages;

import FP.baseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class selectUserPage extends baseTest {
    public static void validateOnPage() {
        // Button Pencari Kos
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("com.binar.kos:id/btn_pencari_kos")));
        // Button Penyewa Kos
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("com.binar.kos:id/btn_penyewa_kos")));
    }

    public static void pencariKosButtonClick() {
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]")).click();
    }

    public static void penyewaKosButtonClick() {
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")).click();
    }
}
