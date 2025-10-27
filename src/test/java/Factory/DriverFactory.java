package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static final ThreadLocal<WebDriver> driver = new ThreadLocal();

    public DriverFactory() {
    }

    public WebDriver initDriver() {
        WebDriver driver;
        switch (System.getProperty("browser", "FIREFOX")) {
            case "CHROME" -> driver = new ChromeDriver();
            case "FIREFOX" -> driver = new FirefoxDriver();
            case "EDGE" -> driver = new EdgeDriver();
            default -> throw new RuntimeException("Browser is not supported");
        }

        driver.manage().window().maximize();
        DriverFactory.driver.set(driver);
        return driver;
    }

    public static WebDriver getDriver() {
        return (WebDriver)driver.get();
    }
}
