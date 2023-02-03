package FP.pages;

import FP.baseTest;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;

public class profilePage extends baseTest {
    public static void validateOnPage() throws InterruptedException {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector()" +
                                        ".text(\"Logout\"))"))).isDisplayed();
    }
}
