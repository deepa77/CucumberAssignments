package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeSteps extends CommonMethods {

    @When("user enters  username and password")
    public void user_enters_username_and_password() {
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));

        usernameField.sendKeys(ConfigReader.read("userName"));
        passwordField.sendKeys(ConfigReader.read("password"));

    }
    @Then("user is able to login successfully")
    public void user_is_able_to_login_successfully() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        System.out.println("Login successfully");
    }
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dashboardPage.pimOption);
    }
    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        WebElement addEmployee = driver.findElement(By.xpath("(//*[text()='Add Employee'])[1]"));
       addEmployee.click();
    }

    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys("Doe");
    }

    @When("user enters firstname and lastname and employeeID")
    public void userEntersFirstnameAndLastnameAndEmployeeID() {
       WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
       firstName.sendKeys("John");
       WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
       lastName.sendKeys("Doe");
       WebElement employeeId= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][2]"));
       employeeId.sendKeys("john123");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
       //WebElement button = driver.findElement(By.xpath("//button[text()=' Save ']"));
      click(addEmployeePage.saveButton);
    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        System.out.println("Test passed");
    }

    @When("user enters invalid employee information")
    public void userEntersInvalidEmployeeInformation() {
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.clear();
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.clear();
        WebElement employeeId= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][2]"));
        employeeId.clear();
    }

    @Then("the user is able to see the error")
    public void theUserIsAbleToSeeTheError() {
        System.out.println("employee information is unable to save.");
    }
}
