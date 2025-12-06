package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "(//*[text()='PIM'])[1]")
    public  WebElement pimOption;


    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

}
