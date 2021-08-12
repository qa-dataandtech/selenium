package com.selenium.form;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class InputCheckBoxMultipleExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("http://demo.guru99.com/test/radio.html");

        Thread.sleep(1000);

        // find all checkbox
        List<WebElement> elements = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // loop over all checkbox and click them
        for(WebElement element: elements) {
            Thread.sleep(1000);
            element.click();
        }

        Thread.sleep(1000);

        // close browser
        driver.close();
    }
}
