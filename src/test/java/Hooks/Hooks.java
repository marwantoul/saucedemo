package Hooks;

import Factory.DriverFactory;
import io.cucumber.java.Before;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;

    public Hooks() {
    }

    @Before
    public void setup() {
        this.driver = (new DriverFactory()).initDriver();
        this.driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        this.driver.get("https://www.saucedemo.com/");
    }
}
