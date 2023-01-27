package com.datantech.group;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupExample {
    WebDriver webDriver;

    @BeforeClass(alwaysRun = true)
    public void start() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.amazon.com");
    }

    @Test(groups = {"testxxx"})
    public void test1() {
        Assert.assertNotNull(webDriver.getTitle());
    }

    @Test
    public void test2() {
        Assert.assertNotNull(webDriver.getTitle());
    }

    @Test(groups = {"testxxx"})
    public void test3() {
        Assert.assertNotNull(webDriver.getTitle());
    }

    @AfterClass(alwaysRun = true)
    public void end() {
        webDriver.quit();
    }
}
