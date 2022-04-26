package cucumber;

import enums.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class Hooks extends PageObject {
    @Before
    public void setUp() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String driverRunning = environmentVariables.getProperty("webdriver.driver");
        if (driverRunning.equals(DriverType.CHROME.toString())) {
            WebDriverManager.chromedriver().setup();
        } else if (driverRunning.equals(DriverType.FIRE_FOX.toString())) {
            WebDriverManager.firefoxdriver().setup();
        }
        open();
        getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(){
        getDriver().quit();
    }
}
