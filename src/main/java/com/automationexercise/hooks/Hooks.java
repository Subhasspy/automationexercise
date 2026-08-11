package com.automationexercise.hooks;

import com.automationexercise.utils.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp(){
        driver= DriverSetup.createDriver();
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        if (driver!=null) {
            driver.quit();
        }
    }
}
