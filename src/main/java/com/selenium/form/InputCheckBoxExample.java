package com.selenium.form;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputCheckBoxExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("http://demo.guru99.com/test/radio.html");

        Thread.sleep(1000);

        // click on html checkbox element
        driver.findElement(By.id("vfb-6-0")).click();

        Thread.sleep(1000);

        // click on html checkbox element
        driver.findElement(By.id("vfb-6-1")).click();

        Thread.sleep(1000);

        // close browser
        driver.close();
    }
}
