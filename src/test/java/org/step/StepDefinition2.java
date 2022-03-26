package org.step;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {
	@Given("user enter to the login page")
	public void user_enter_to_the_login_page() {
		launchUrl("https://www.facebook.com/");
		maxmizeWindow();
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		clickbutton(loginbtn);
	    
	}

	@Then("user will navigates to the invalid credential page")
	public void user_will_navigates_to_the_invalid_credential_page() {
		System.out.println("user enter invalid credential page");
		Assert.assertTrue(false);
	    
	}

}
