@test
Feature: Ajax Data, ScrollBars, Mouse Over

  Background:
    Given the user goes to website

  Scenario: AJAX Data - Waits for label text to appear
    When the user clicks "AJAX Data"
    And the user clicks Button Triggering Ajax Request button
    Then the user should be able to see label text "Data loaded with AJAX get request."

  Scenario: ScrollBars - Scroll the button into a visible area
    When the user clicks "Scrollbars"
    And the user scrolls till the Hiding Button appears
    Then the user should be able to clicks the Hiding Button

  Scenario: Mouse Over - Make sure that click count is increasing by 2
    When the user clicks "Mouse Over"
    And the user hover over on Click Me button
    And the user applies two consecutive link clicks to Click Me button
    Then the user verifies click count is increasing by 2