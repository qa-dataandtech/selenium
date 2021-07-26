package com.selenium.script;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("http://demo.guru99.com/test/newtours/register.php");

        driver.findElement(By.name("firstName")).sendKeys("jack");
        Thread.sleep(1000);

        driver.findElement(By.name("lastName")).sendKeys("smith");
        Thread.sleep(1000);

        driver.findElement(By.name("phone")).sendKeys("7034567890");
        Thread.sleep(1000);

        driver.findElement(By.name("userName")).sendKeys("smith0001");
        Thread.sleep(1000);

        driver.findElement(By.name("address1")).sendKeys("9345 burke road");
        Thread.sleep(1000);

        driver.findElement(By.name("city")).sendKeys("springfield");
        Thread.sleep(1000);

        driver.findElement(By.name("state")).sendKeys("VA");
        Thread.sleep(1000);

        driver.findElement(By.name("postalCode")).sendKeys("22015");
        Thread.sleep(1000);

        // click on html radio button
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        driver.findElement(By.name("email")).sendKeys("smith0001@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("smith0001");
        Thread.sleep(1000);

        driver.findElement(By.name("confirmPassword")).sendKeys("smith0001");
        Thread.sleep(1000);

        Thread.sleep(1000);

        driver.findElement(By.name("submit")).submit();

        Thread.sleep(1000);

        // close browser
        driver.close();
    }
}
