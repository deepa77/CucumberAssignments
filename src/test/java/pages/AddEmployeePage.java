package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameloc;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameloc;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
