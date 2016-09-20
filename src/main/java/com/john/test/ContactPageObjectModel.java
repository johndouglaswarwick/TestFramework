package com.john.test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;


public class ContactPageObjectModel {

    private static SeleniumDriver driver;


    public ContactPageObjectModel()
    {
        driver = SeleniumDriver.getInstance();

    }

    public boolean clickOnHamburgerandNavigatetoContacts()
    {
        try {
            driver.getDriver().findElement(By.cssSelector("#contacticon > div > div > div.hamburger__front_lang > i")).click();
            return true;
        }
        catch( ElementNotFoundException o)
        {
            return false;
        }
    }

    public boolean countValtechOffices(int numberofOffices) {
        Logger logger = Logger.getGlobal();
        try {
            WebElement getElement = driver.getDriver().findElement(By.cssSelector("#contactbox > div"));
            List<WebElement> getElements = driver.getDriver().findElements(By.className("contactcountry"));

            int count = 0;

            for (int i = 0; i<= getElements.size()-1; i++)
            {
                List<WebElement> contactcities = getElements.get(i).findElements(By.className("contactcities"));
                count = count + contactcities.size();
            }

            logger.getGlobal();

            logger.info(String.valueOf(count));

            if (count == numberofOffices)
                return true;
            else
                return false;
        } catch (ElementNotFoundException e) {
            return false;
        }

    }
    public boolean closeBrowser()
    {
        driver.getDriver().close();
        return true;
    }
}
