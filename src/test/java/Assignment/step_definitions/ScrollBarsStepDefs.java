package Assignment.step_definitions;

import Assignment.pages.ScrollBarsPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class ScrollBarsStepDefs {

    ScrollBarsPage scrollBarsPage = new ScrollBarsPage();

    @When("the user scrolls till the Hiding Button appears")
    public void the_user_scrolls_till_the_Hiding_Button_appears() {
        scrollBarsPage.scrollToElement(scrollBarsPage.hidingButton);
    }

    @Then("the user should be able to clicks the Hiding Button")
    public void the_user_should_be_able_to_clicks_the_Hiding_Button() {
        scrollBarsPage.hidingButton.click();
        assertTrue("Element is not displayed", scrollBarsPage.hidingButton.isDisplayed());
    }
}
