package Assignment.step_definitions;

import Assignment.pages.AjaxDataPage;
import Assignment.utilities.ConfigurationReader;
import Assignment.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class AjaxDataStepDefs {

    AjaxDataPage ajaxDataPage = new AjaxDataPage();

    WebDriverWait wait=new WebDriverWait(Driver.get(),15);
    @Given("the user goes to website")
    public void the_user_goes_to_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user clicks {string}")
    public void the_user_clicks(String featureName) {
        ajaxDataPage.navigateToModule(featureName);
    }

    @When("the user clicks Button Triggering Ajax Request button")
    public void the_user_clicks_Button_Triggering_Ajax_Request_button() {
        ajaxDataPage.ajaxButton.click();
        ajaxDataPage.waitForVisibility(ajaxDataPage.ajaxTextBox);
    }

    @Then("the user should be able to see label text {string}")
    public void the_user_should_be_able_to_see_label_text(String text) {
        assertEquals("The texts are not equal",text,ajaxDataPage.ajaxTextBox.getText());
    }

}
