package Assignment.step_definitions;

import Assignment.pages.MouseOverPage;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class MouseOverStepDefs {

    MouseOverPage mouseOverPage = new MouseOverPage();

    @When("the user hover over on Click Me button")
    public void the_user_hover_over_on_Click_Me_button()  {
        mouseOverPage.hoverOver(mouseOverPage.clickMeButton);
    }

    @When("the user applies two consecutive link clicks to Click Me button")
    public void the_user_applies_consecutive_link_clicks_to_Click_Me_button()  {
        mouseOverPage.doubleClick(mouseOverPage.clickMeButton);
    }


    @Then("the user verifies click count is increasing by {int}")
    public void theUserVerifiesClickCountIsIncreasingBy(int count) {
        int actualCount=Integer.parseInt(mouseOverPage.clickCount.getText());
        assertEquals("The actual count "+actualCount+" is not equal expected count "+count,count,actualCount);
    }
}
