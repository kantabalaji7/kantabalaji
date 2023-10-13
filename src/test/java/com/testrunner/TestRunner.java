package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kanta\\eclipse-workspace\\BDD_CucumberProject\\FeatureFile\\Cucumber.feature", glue="com.step.defination")
public class TestRunner {
	

}
