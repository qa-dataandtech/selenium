package com.datantech.itestlistener;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

public class ITestListenerExample extends BaseTest{

    @Test
    public void testLogin() {
        driver.get("https://www.cnn.com");
        String text = driver.findElement(By.linkText("Videos")).getText();
        Assert.assertEquals("Videoss", text);
    }

}
