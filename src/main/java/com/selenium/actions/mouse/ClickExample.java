package com.selenium.actions.mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickExample {
    public static void main(String[] args) throws InterruptedException {
        // Step1: setup driver
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance (think like start the car)
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        // step 4: find element by link text
        WebElement email = driver.findElement(By.linkText("Best Sellers"));

        // step 5: click on the link
        email.click();

        // wait 1000 milisecond
        Thread.sleep(1000);

        // step 6: close the driver (think like stop the car)
        driver.close();
    }
}
