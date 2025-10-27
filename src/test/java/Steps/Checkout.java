package Steps;

import Factory.DriverFactory;
import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Checkout {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckOutStepOnePage checkOutStepOnePage = new CheckOutStepOnePage(driver);
    CheckOutStepTwoPAge checkOutStepTwoPAge = new CheckOutStepTwoPAge(driver);

    @Given("the user logs in with {string} and {string}")
    public void the_user_logs_in_with(String username, String password) {
        loginPage.signup(username, password);
        loginPage.ClickSignupButton();
    }

    @And("the user clicks the Add to Cart button for a product")
    public void the_user_clicks_add_to_cart_button() {
        homePage.ClickToAddProductInCart();
        System.out.println("The user successfully added a product in the cart ");
    }

    @When("the user opens the cart page")
    public void the_user_opens_the_cart_page() {
        homePage.ClickInTheNotif();
        System.out.println("The user successfully opened the notification ");
    }

    @And("the user clicks the Checkout button")
    public void the_user_clicks_checkout_button() {
        cartPage.clickCheckoutButton();
    }

    @And("the user enters {string}, {string}, and {string}")
    public void the_user_enters_checkout_info(String firstName, String lastName, String postalCode) {
        checkOutStepOnePage.fillCheckoutForm(firstName, lastName, postalCode);
        System.out.println("The checkout information are entered successfully ");
    }

    @And("the user clicks the Continue button")
    public void the_user_clicks_continue_button() {
        checkOutStepOnePage.clickContinueButton();
    }

    @And("the user clicks the button Finish")
    public void the_user_clicks_finish_button() {
        checkOutStepTwoPAge.clickFinishButton();
    }

    @Then("a success message should be displayed")
    public void a_success_message_should_be_displayed() {
        Assert.assertTrue(checkOutStepTwoPAge.isSuccessMessageDisplayed(), "Le message de confirmation n'est pas affiché !");
        System.out.println("The checkout is added successfully ");
    }
}