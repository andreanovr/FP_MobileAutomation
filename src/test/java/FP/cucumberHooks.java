package FP;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class cucumberHooks {
    @BeforeAll
    public static void beforeAll() throws MalformedURLException {
        baseTest.setupDriver();
    }

    @AfterAll
    public static void afterAll() {
        baseTest.stopDriver();
    }

    @After
    public static void after() {
        baseTest.resetApp();
    }
}
