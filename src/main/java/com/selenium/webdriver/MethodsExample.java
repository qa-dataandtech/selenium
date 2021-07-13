package com.selenium.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsExample {
    public static void main(String[] args) {
        // find the driver and use that
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        //invoke get method
        // get()     -> go to an address
        driver.get("https://www.amazon.com");

        // invoke getCurrentUrl method
        // getCurrentUrl()     -> get the current url and print
        System.out.println(driver.getCurrentUrl());

        // invoke getTitle method
        // getTitle()     -> get the current page title
        System.out.println(driver.getTitle());

        //invoke findElement method
        // findElement() -> find an element from a page
        WebElement email = driver.findElement(By.id("glow-ingress-line1"));
        System.out.println("Value for element glow-ingress-line1: " + email.getText());

        // invoke getPageSource method
        // getPageSource()     -> get the current page source
        System.out.println(driver.getPageSource());

        // invoke close method
        // close()  -> Close the current window
        driver.close();

        // invoke quit method
        // quit()  -> Quits this driver instance
        driver.quit();
    }
}
