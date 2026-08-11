package com.automationexercise.stepdefinitions;

import com.automationexercise.hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SmokeSteps {
    @Given("the user navigates to the automation exercise home page")
    public void navigateToHomePage(){
        Hooks.driver.get("https://automationexercise.com/");
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"Website for automation practice\"]")));
    }
    @Then("the page title should contain {string}")
    public void verifyPageTitle(String expectedTitle){
        String actualTitle = Hooks.driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle),"Expected title to contain:" + expectedTitle + " but was: " + actualTitle);
    }
}
