package com.datantech.priority;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityExample {
    public String baseUrl = "https://www.google.com/";
    public WebDriver driver ;
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching Chrome browser");

        // find the driver and use that
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    // Method 1: Launch Google.com
    @Test(priority = 1)
    public void launchGoogle() {
        driver.get("http://www.google.co.in");
    }
    // Method 2: Perform a search using "Facebook"
    @Test(priority = 2)
    public void peformSeachAndClick1stLink() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Facebook");
    }
    // Method 3: Verify Google search page title.
    @Test(priority = 3)
    public void FaceBookPageTitleVerification() throws Exception {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).submit();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
