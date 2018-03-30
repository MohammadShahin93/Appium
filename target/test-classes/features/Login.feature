@regression
Feature: login

  @TA-9
  Scenario: Verify invalid login on android hotel app
    When I scroll down on page
    And I tap on sign in button
    And I fill out invalid username and password
    Then I verify invalid error message



