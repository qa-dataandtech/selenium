package com.selenium.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdExample {
    public static void main(String[] args) {
        // Step1: setup driver
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance (think like start the car)
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        // step 4: find element by Id
        WebElement webElement = driver.findElement(By.id("glow-ingress-line1"));

        System.out.println("Value for element glow-ingress-line1: " + webElement.getText());

        // step 5: close the driver (think like stop the car)
        driver.close();
    }
}
