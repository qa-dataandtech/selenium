package com.datantech.itestlistener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static WebDriver driver;

    @BeforeSuite
    public void launchBrowser() {
        System.out.println("launching Chrome browser");

        // find the driver and use that
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void terminateBrowser(){
        driver.close();
        driver.quit();
    }
}
