package com.step.defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
    public WebDriver driver;
    
    
	

@Given("Open Application")
public void open_application() {
	driver = new ChromeDriver();
	
	driver.get("http://183.82.103.245/nareshit/login.php");
	
    
}

@When("Verify Title")
public void verify_title() {
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    driver.findElement(By.name("Submit")).click();
    System.out.println("Login Application");
    driver.findElement(By.linkText("Logout")).click();
    

}

@Then("Close Application")
public void close_application() {
  
    driver.close();	
}



}
