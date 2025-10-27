package Steps;
import Factory.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {
    LoginPage loginPage;
    WebDriver driver = DriverFactory.getDriver();

    public Login (){

        this.loginPage = new LoginPage(this.driver);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("The user is currently on the login page");
    }
    @When("the user enters the username {string} and the password {string}")
    public void the_user_enters_the_username_and_the_password(String login, String password) {
      loginPage.signup(login,password);
        System.out.println("The login credentials are entered successfully ");

    }
    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {

        loginPage.ClickSignupButton();
        System.out.println("The user successfully clicked the button ");
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String message) {
        boolean isCorrectDashboardDisplayed = loginPage.LoginResult(message);
        System.out.println("the message displayed is "+ message );
        Assert.assertTrue(isCorrectDashboardDisplayed, "the message displayed is " + message + " n'est pas affiché !");

    }
}
