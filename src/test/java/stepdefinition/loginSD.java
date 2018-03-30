package stepdefinition;

import Pages.LandingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by mohammad on 3/29/18.
 */
public class loginSD {

    LandingPage landingPage = new LandingPage();



    @When("^I scroll down on page$")
    public void iScrollDownOnPage()  {
        landingPage.tapOnYesButton();
        landingPage.tapOnMainMenuButton();


    }

    @And("^I tap on sign in button$")
    public void iTapOnSignInButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I fill out invalid username and password$")
    public void iFillOutInvalidUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I verify invalid error message$")
    public void iVerifyInvalidErrorMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
