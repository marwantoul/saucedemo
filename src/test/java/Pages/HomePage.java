package Pages;

import Base.BasePage;
import Factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By AddProduct = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By RemoveProduct = By.id("remove-sauce-labs-bolt-t-shirt");
    By notif = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ClickToAddProductInCart() {

        this.driver.findElement(this.AddProduct).click();
    }


    public boolean isRemoveButtonDisplayed() {
        return driver.findElements(RemoveProduct).size() > 0;
    }

    public boolean isCartNotificationDisplayed() {
        return driver.findElements(notif).size() > 0;
    }

    public void ClickInTheNotif() {

        this.driver.findElement(this.notif).click();
    }
}
