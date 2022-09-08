$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SpriteCloudUI.feature");
formatter.feature({
  "name": "Ajax Data, ScrollBars, Mouse Over",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_goes_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "AJAX Data - Waits for label text to appear",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "the user clicks \"AJAX Data\"",
  "keyword": "When "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Button Triggering Ajax Request button",
  "keyword": "And "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_clicks_Button_Triggering_Ajax_Request_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see label text \"Data loaded with AJAX get request.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_should_be_able_to_see_label_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_goes_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ScrollBars - Scroll the button into a visible area",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "the user clicks \"Scrollbars\"",
  "keyword": "When "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user scrolls till the Hiding Button appears",
  "keyword": "And "
});
formatter.match({
  "location": "Assignment.step_definitions.ScrollBarsStepDefs.the_user_scrolls_till_the_Hiding_Button_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to clicks the Hiding Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Assignment.step_definitions.ScrollBarsStepDefs.the_user_should_be_able_to_clicks_the_Hiding_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to website",
  "keyword": "Given "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_goes_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mouse Over - Make sure that click count is increasing by 2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "the user clicks \"Mouse Over\"",
  "keyword": "When "
});
formatter.match({
  "location": "Assignment.step_definitions.AjaxDataStepDefs.the_user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user hover over on Click Me button",
  "keyword": "And "
});
formatter.match({
  "location": "Assignment.step_definitions.MouseOverStepDefs.the_user_hover_over_on_Click_Me_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user applies two consecutive link clicks to Click Me button",
  "keyword": "And "
});
formatter.match({
  "location": "Assignment.step_definitions.MouseOverStepDefs.the_user_applies_consecutive_link_clicks_to_Click_Me_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies click count is increasing by 2",
  "keyword": "Then "
});
formatter.match({
  "location": "Assignment.step_definitions.MouseOverStepDefs.theUserVerifiesClickCountIsIncreasingBy(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});