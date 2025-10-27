package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By yourCartTitle = By.xpath("//*[@class='title']");
    By checkoutButton = By.xpath("//button[@data-test='checkout']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isYourCartDisplayed() {
        return driver.findElements(yourCartTitle).size() > 0;
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }
}