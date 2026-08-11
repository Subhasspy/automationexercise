package com.automationexercise.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automationexercise.stepdefinitions", "com.automationexercise.hooks"},
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
