package com.john.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;


public final class SeleniumDriver {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private static SeleniumDriver ourInstance = null;


    public static SeleniumDriver getInstance() {

        if(ourInstance == null) {
            ourInstance = new SeleniumDriver();
        }
        return ourInstance;
    }

    public WebDriverWait getWait()
    {
        return webDriverWait;
    }

    public WebDriver getDriver()
    {
        return driver;
    }


    private SeleniumDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\john_\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        webDriverWait = new WebDriverWait( driver, 30);
    }
}
