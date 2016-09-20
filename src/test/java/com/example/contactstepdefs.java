package com.example;

import com.john.test.ContactPageObjectModel;
import com.john.test.EnvironmentJenkins;
import com.john.test.HomePageObjectModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by john_ on 19/09/2016.
 */
public class contactstepdefs {

    private ContactPageObjectModel pagemodel = new ContactPageObjectModel();

    @Given("^I click on the contact menu$")
    public void iClickOnTheContactMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pagemodel.clickOnHamburgerandNavigatetoContacts());
    }

    @When("^I count the amount of offices$")
    public void iCountTheAmountOfOffices() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^The amount of offices is correct$")
    public void theAmountOfOfficesIsCorrect() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pagemodel.countValtechOffices(14));
        Assert.assertTrue(pagemodel.closeBrowser());
    }
}
