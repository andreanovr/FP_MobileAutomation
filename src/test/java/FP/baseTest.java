package FP;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class baseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;
    public static void setupDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability( "appium:platformVersion", "12");
//        capabilities.setCapability( "appium:deviceName", "Redmi Note 10 Pro");
//        capabilities.setCapability("appium:udid", "f56a89e5");
        capabilities.setCapability( "appium:deviceName", "tes-phone");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability( "appium:appPackage", "com.binar.kos");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability( "appium:appActivity", "com.binar.kos.view.ui.selectUser.SelectUserActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static void stopDriver() {
        driver.quit();
    }

    public static void resetApp() {
        driver.terminateApp("com.binar.kos");
        driver.activateApp("com.binar.kos");
    }
}
