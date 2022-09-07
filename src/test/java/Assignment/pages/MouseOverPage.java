package Assignment.pages;

import Assignment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends BasePage{
    Actions actions=new Actions(Driver.get());

    @FindBy(xpath = "//a[text()='Click me']")
    public WebElement clickMeButton;

    @FindBy(xpath = "//span[@id='clickCount']")
    public WebElement clickCount;

    public void hoverOver(WebElement element){
        actions.moveToElement(element).perform();
    }
    public void doubleClick(WebElement element){
        actions.doubleClick(element).perform();
    }
}
