package com.example;

import com.john.test.CasesPageObjectModel;
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
public class casesstepdefs {

    private CasesPageObjectModel objectModel = new CasesPageObjectModel();


    @Given("^I click on the hamburger menu$")
    public void iClickOnTheHamburgerMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objectModel.clickOnHamburgerandNavigatetoCases());
    }

    @When("^I select Cases menu option$")
    public void iSelectCasesMenuOption() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^The cases title is displayed$")
    public void theCasesTitleIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(objectModel.checkPageName("Cases"));
    }
}
