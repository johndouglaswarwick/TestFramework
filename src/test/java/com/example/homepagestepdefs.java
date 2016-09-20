package com.example;

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


public class homepagestepdefs {
    private EnvironmentJenkins environment = new EnvironmentJenkins();
    private HomePageObjectModel homepage = new HomePageObjectModel();

    @Given("^Navigation to homepage$")
    public void navigationToHomepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(homepage.navigateTo(environment.url()));
    }

    @When("^I check for the latest news section$")
    public void iCheckForTheLatestNewsSection() throws Throwable {
        // left blank intentionally (JW)
    }

    @Then("^Latest News Section is displayed$")
    public void latestNewsSectionIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(homepage.latestnewsCheck("LATEST NEWS"));
    }
}
