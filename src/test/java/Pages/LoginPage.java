package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By UsernameInput = By.id("user-name");
    By PasswordInput = By.id("password");
    By buttonInput = By.id("login-button");
    By Homepagemessage = By.xpath("//*[@class='title']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void signup(String login, String password) {
        driver.findElement(UsernameInput).sendKeys(login);
        driver.findElement(PasswordInput).sendKeys(password);
    }

    public void ClickSignupButton() {

        this.driver.findElement(this.buttonInput).click();
    }

    public boolean LoginResult(String message) {




        // Cas de succès : on attend "Products"
        if (message.equals("Products")) {
            if (driver.findElements(Homepagemessage).size() > 0) {
                String actualTitle = driver.findElement(Homepagemessage).getText().trim();
                return actualTitle.equals(message);
            } else {
                return false;
            }
        }

        // Cas d'erreur : on vérifie le message d'erreur affiché
        if (driver.findElements(errorMessage).size() > 0) {
            String actualError = driver.findElement(errorMessage).getText().trim();
            return actualError.equals(message);
        }


        return false;

    }
}
