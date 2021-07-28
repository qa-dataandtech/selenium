package com.datantech.testngmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodsExampleTest {
    public String baseUrl = "https://www.amamzon.com/";
    public WebDriver driver ;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching Chrome browser");

        // find the driver and use that
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void verifyBackToSchoolDeal() {
        String expectedTitle = "Shop Back to School deals";
        String actualTitle = driver.findElement(By.id("swm-link")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void terminateBrowser(){
        driver.close();
        driver.quit();
    }
}
