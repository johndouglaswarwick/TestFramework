package com.example;

import com.john.test.EnvironmentJenkins;
import com.john.test.HomePageObjectModel;
import com.john.test.JobsPageObjectModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by john_ on 19/09/2016.
 */
public class jobsstepdefs {
    private JobsPageObjectModel pagemodel = new JobsPageObjectModel();

    @Given("^I click on the jobs hamburger menu$")
    public void iClickOnTheJobsHamburgerMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pagemodel.clickOnHamburgerandNavigatetoJobs());
    }

    @When("^I select Jobs menu option$")
    public void iSelectJobsMenuOption() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^The Jobs title is displayed$")
    public void theJobsTitleIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pagemodel.checkPageName("Jobs"));
    }
}
