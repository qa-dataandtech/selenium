package com.selenium.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SetupEdge {
    public static void main(String[] args) {

        // find the driver and use that
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new EdgeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        // close browser
        driver.close();
    }
}
