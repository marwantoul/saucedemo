package Steps;
import Factory.DriverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class AddProductCart {


    public AddProductCart() {
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver); // si tu l'utilises plus tard
    }


    LoginPage loginPage;
    HomePage homePage;
    WebDriver driver = DriverFactory.getDriver();

    @Given("the user logs in with valid credentials {string} and {string}")
    public void the_user_logs_in_with_valid_credentials_and(String login, String password) {
        loginPage.signup(login,password);
        loginPage.ClickSignupButton();
    }
    @When("the user clicks the {string} button for a product")
    public void the_user_clicks_the_button_for_a_product(String string) {
        homePage.ClickToAddProductInCart();
        System.out.println("The user successfully added a product in the cart ");
    }
    @Then("the button changes to {string} for that product")
    public void the_button_changes_to_for_that_product(String expectedText) {
        boolean isChanged = homePage.isRemoveButtonDisplayed();
        Assert.assertTrue(isChanged, "Le bouton n'a pas changé en '" + expectedText + "'");
        System.out.println("The bouton is successfully updated to '/remove/' ");

    }
    @And("a cart notification is displayed")
    public void a_cart_notification_is_displayed() {

        boolean isNotificationVisible = homePage.isCartNotificationDisplayed();
        System.out.println("the notification is successfully displayed");
        Assert.assertTrue(isNotificationVisible, "La notification du panier n'est pas affichée !");

    }



}




