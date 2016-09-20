package com.john.test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class HomePageObjectModel{

    private static SeleniumDriver driver;


    public HomePageObjectModel()
    {
        driver = SeleniumDriver.getInstance();

    }

    public boolean navigateTo( String url )
    {
        driver.getDriver().navigate().to(url);
        driver.getWait().until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".news-post__listing-header > header:nth-child(1) > h2:nth-child(1)"))));

        return true;
    }

    public boolean latestnewsCheck(String latestnewsSection)
    {
        Logger logger = Logger.getGlobal();
        try {
            WebElement getElement = driver.getDriver().findElement(By.cssSelector(".news-post__listing-header > header:nth-child(1) > h2:nth-child(1)"));
            logger.info(getElement.getText());
            if( getElement.getText().contains(latestnewsSection))
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
