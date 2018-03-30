$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify invalid login on android hotel app",
  "description": "",
  "id": "login;verify-invalid-login-on-android-hotel-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TA-9"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I scroll down on page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I tap on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I fill out invalid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify invalid error message",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSD.iScrollDownOnPage()"
});
formatter.result({
  "duration": 22411567407,
  "status": "passed"
});
formatter.match({
  "location": "loginSD.iTapOnSignInButton()"
});
formatter.result({
  "duration": 5469917,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepdefinition.loginSD.iTapOnSignInButton(loginSD.java:30)\n\tat ✽.And I tap on sign in button(Login.feature:7)\n",
  "status": "pending"
});
formatter.match({
  "location": "loginSD.iFillOutInvalidUsernameAndPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSD.iVerifyInvalidErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2987342990,
  "status": "passed"
});
});