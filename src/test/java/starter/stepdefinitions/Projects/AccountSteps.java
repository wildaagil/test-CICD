package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Account.GetAccount;

public class AccountSteps {

    @Steps
    GetAccount getAccount;
    @Given("I set url and valid username and password to post account")
    public void iSetUrlAndValidUsernameAndPasswordToPostAccount() {
        getAccount.setUrlAndValidUsernameAndPassword();
    }

    @When("I request valid username and password")
    public void iRequestValidUsernameAndPassword() {
        getAccount.bodyCreateAccount();
    }

    @Then("I will get 200")
    public void iWillGet200() {
        getAccount.validateStatus200();
    }

    @Then("I will get 400")
    public void iWillGet400() {
        getAccount.validateStatusCode();
    }

    @Given("I set url and invalid username and valid password to post account")
    public void iSetUrlAndInvalidUsernameAndValidPasswordToPostAccount() {
        getAccount.setUrlAndInvalidUsernameAndPassword();
    }

    @Given("I set url and valid username and invalid password to post account")
    public void iSetUrlAndValidUsernameAndInvalidPasswordToPostAccount() {
        getAccount.setUrlAndValidUsernameAndInvassword();
    }

    @Given("I set url and invalid username and invalid password to post account")
    public void iSetUrlAndInvalidUsernameAndIvalidPasswordToPostAccount() {
        getAccount.setUrlAndInvalidUsernameAndInvalidpassword();
    }

    @When("I request invalid username")
    public void iRequestInvalidUsername() {
        getAccount.bodyInvalidUsername();
    }

    @When("I request invalid password")
    public void iRequestInvalidPassword() {
        getAccount.bodyInvalidPassword();
    }

    @When("I request invalid usernamen and password")
    public void iRequestInvalidUsernamenAndPassword() {
        getAccount.bodyInvalidUsernameAndPassword();
    }

    @And("I can verify the detail response")
    public void iCanVerifyTheDetailResponse(){
        getAccount.validateForbiddenMessage();
    };
}
