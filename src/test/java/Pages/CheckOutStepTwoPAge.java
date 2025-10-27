package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepTwoPAge extends BasePage {


    By finishButton = By.id("finish");
    By successMessage = By.className("complete-header");

    public CheckOutStepTwoPAge(WebDriver driver) {
        super(driver);
    }


    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElements(successMessage).size() > 0;
    }
}