package com.john.test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;


public class ServicesPageObjectModel {

    private static SeleniumDriver driver;


    public ServicesPageObjectModel()
    {
        driver = SeleniumDriver.getInstance();

    }

    public boolean clickOnHamburgerandNavigatetoServices() throws InterruptedException {
        try {
            driver.getDriver().findElement(By.cssSelector("#navigation-toggle-button > div > div > div.hamburger__front > i")).click();

            for ( int i=0; i <= 6000; i++) {
                WebElement menuoption = driver.getDriver().findElement(By.cssSelector("#navigationMenuWrapper > div > div:nth-child(1) > ul > li:nth-child(3) > a"));
                Thread.sleep(1000);
                if (menuoption.isDisplayed())
                {
                    menuoption.click();
                    break;
                }
            }


            return true;
        }
        catch( ElementNotFoundException o)
        {
            return false;
        }
    }

    public boolean checkPageName(String pageTitle)
    {
        Logger logger = Logger.getGlobal();
        try {
            WebElement getElement = driver.getDriver().findElement(By.cssSelector("#container > section > header > h1"));
            logger.info(getElement.getText());
            if( getElement.getText().contains(pageTitle))
                return true;
            else
                return false;
        }
        catch (ElementNotFoundException e)
        {
            return false;
        }

    }

}
