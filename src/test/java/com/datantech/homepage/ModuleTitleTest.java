package com.datantech.homepage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModuleTitleTest {
    @Test
    public void test1() {

        // find the driver and use that
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.datantech.com");


        // close browser
        driver.close();
    }
}
