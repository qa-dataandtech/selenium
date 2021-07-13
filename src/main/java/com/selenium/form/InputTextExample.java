package com.selenium.form;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTextExample {
    public static void main(String[] args) throws InterruptedException {
        // Step1: setup driver
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance (think like start the car)
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        // step 4: find element by form input name (input is part of form element)
        WebElement searchBox = driver.findElement(By.name("field-keywords"));

        // Step 5: put book on the search box
        searchBox.sendKeys("book");

        // Step 6: find submit button and submit
        driver.findElement(By.id("nav-search-submit-button")).submit();

        // sleep for 1000 miliseconds
        Thread.sleep(2000);

        // step 7: close the driver (think like stop the car)
        driver.close();
    }
}
