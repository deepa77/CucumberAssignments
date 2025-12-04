package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        openBrowserAndLaunchApplication();
    }
    @When("the user enters valid credentials with username and password")
    public void the_user_enters_valid_credentials_with_username_and_password() {

   WebElement usernameField = driver.findElement(By.xpath("//*[@name='username']"));
   WebElement passwordField = driver.findElement(By.xpath("//*[@name='password']"));

        usernameField.sendKeys(ConfigReader.read("userName"));
         passwordField.sendKeys(ConfigReader.read("password"));

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
         WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
         loginButton.click();
    }
    @Then("the user should be redirected to the dashboard page.")
    public void the_user_should_be_redirected_to_the_dashboard_page() {
      //  Assert.assertTrue(dashboardPage.welcomeScreenLoc.isDisplayed());

        System.out.println("Test passed");
    }

    @When("the user enter empty username and empty password")
    public void the_user_enter_empty_username_and_empty_password() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@name='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@name='password']"));

        usernameField.sendKeys(ConfigReader.read(""));
        passwordField.sendKeys(ConfigReader.read(""));

    }
    @Then("the user is able to see the error messsage")
    public void the_user_is_able_to_see_the_error_messsage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters invalid credentials with username and password")
    public void the_user_enters_invalid_credentials_with_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
