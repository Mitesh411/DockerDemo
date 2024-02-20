package org.miteshdandade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
    private WebDriver driver;
    String appURL = "http://google.com";

    @BeforeClass
    public void testSetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
         driver = new ChromeDriver(options);
     //   driver = new ChromeDriver();
    }

    @Test
    public void verifyGooglePageTittle() {
        driver.manage().window().maximize();
        driver.navigate().to(appURL);

        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "Google");
    }

    @Test
    public void verifyGoogleSearchResult(){
        driver.manage().window().maximize();
        driver.navigate().to(appURL);

        System.out.println("Current URL is:" + driver.getCurrentUrl());

        System.out.println("Current Title is:" + driver.getTitle());
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
