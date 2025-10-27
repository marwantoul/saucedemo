package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends BasePage {


    By finishButton = By.id("finish");
    By successMessage = By.className("complete-header");

    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }


    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElements(successMessage).size() > 0;
    }
}