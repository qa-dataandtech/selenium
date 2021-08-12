package com.datantech.assertex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTest {

    @Test
    public  void assertTestExample() {

        // find the driver and use that
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        String pageTitle = driver.getTitle();
        String expectedPageTitle = "Amazon.com. Spend less. Smile more.";

        Assert.assertEquals(expectedPageTitle, pageTitle);

        // close browser
        //driver.close();
    }
}
