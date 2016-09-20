package com.example;

import com.john.test.EnvironmentJenkins;
import com.john.test.HomePageObjectModel;
import com.john.test.ServicesPageObjectModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by john_ on 19/09/2016.
 */
public class servicesstepdefs {

    private ServicesPageObjectModel pagemodel = new ServicesPageObjectModel();

    @Given("^I click on the services hamburger menu$")
    public void iClickOnTheServicesHamburgerMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pagemodel.clickOnHamburgerandNavigatetoServices());
    }

    @When("^I select services menu option$")
    public void iSelectServicesMenuOption() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^The cases service title is displayed$")
    public void theCasesServiceTitleIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pagemodel.checkPageName("Service"));
    }
}
