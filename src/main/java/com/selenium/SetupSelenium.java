package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetupSelenium {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        Thread.sleep(1000);

        // click on login button
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();

        Thread.sleep(1000);


        // find email field and put email address
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("khan.salauddin@hotmail.com");

        Thread.sleep(1000);

        // continue to next page
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        Thread.sleep(1000);

        // find password field and put password
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("PASSWORD");

        Thread.sleep(1000);

        // click sign in
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

        // wait for 5 seconds
        Thread.sleep(2000);

        // close browser
        driver.close();
    }
}
