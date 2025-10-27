package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepOnePage extends BasePage {

    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By successMessage = By.className("complete-header");

    public CheckOutStepOnePage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckoutForm(String firstName, String lastName, String postalCode) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElements(successMessage).size() > 0;
    }
}