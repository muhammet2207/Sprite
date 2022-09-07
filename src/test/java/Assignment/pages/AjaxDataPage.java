package Assignment.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AjaxDataPage extends BasePage{

    @FindBy(id = "ajaxButton")
    public WebElement ajaxButton;

    @FindBy(xpath = "//p[@class=\"bg-success\"]")
    public WebElement ajaxTextBox;

    public  void clickAjaxButton(){
        ajaxButton.click();
        wait.until(ExpectedConditions.visibilityOf(ajaxTextBox));
    }
}
