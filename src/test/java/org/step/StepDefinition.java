package org.step;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass{


@Given("user should be enter the login webpage")
public void user_should_be_enter_the_login_webpage() {
	launchUrl("https://www.facebook.com/");
	maxmizeWindow();
	
    
}

@When("user enter the invalid {string} and {string}")
public void user_enter_the_invalid_and(String user, String pass) {
   WebElement username=driver.findElement(By.id("email"));
   fillText(username,user);
   WebElement password=driver.findElement(By.id("pass"));
   fillText(password,pass);
}
	
	
   


@When("user click the login button")
public void user_click_the_login_button() throws InterruptedException {
	WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
	clickbutton(loginbtn);
	
}

@Then("user will navigate to the invalid credential page")
public void user_will_navigate_to_the_invalid_credential_page() {
	System.out.println("user enter invalid credential page");
	
    
}



}
