package Assignment.pages;

import Assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String featureName) {
        WebElement feature = Driver.get().findElement(By.xpath("//a[text()=\"" + featureName + "\"]"));
        feature.click();
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
