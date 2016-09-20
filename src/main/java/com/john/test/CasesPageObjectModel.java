package com.john.test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;


public class CasesPageObjectModel {

    private static SeleniumDriver driver;


    public CasesPageObjectModel()
    {
        driver =  SeleniumDriver.getInstance();

    }

    public boolean clickOnHamburgerandNavigatetoCases() throws InterruptedException {
        try {
            driver.getDriver().navigate().to("http://www.valtech.com");
            driver.getWait().until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("#navigation-toggle-button > div > div > div.hamburger__front > i"))));
            driver.getDriver().findElement(By.cssSelector("#navigation-toggle-button > div > div > div.hamburger__front > i")).click();

            for ( int i=0; i <= 6000; i++) {
                WebElement menuoption = driver.getDriver().findElement(By.cssSelector("#navigationMenuWrapper > div > div:nth-child(1) > ul > li:nth-child(1) > a"));
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
            WebElement getElement = driver.getDriver().findElement(By.cssSelector("#container > header > h1"));
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
