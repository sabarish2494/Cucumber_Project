package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 extends BaseClass{


@Given("user shoud be in amazon webpage")
public void user_shoud_be_in_amazon_webpage() {
	launchUrl("https://www.amazon.in/");
	maxmizeWindow();
    
}

@When("user should type the product name")
public void user_should_type_the_product_name(io.cucumber.datatable.DataTable d2) {
	List<Map<String, String>> m = d2.asMaps();
	WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
   fillText(searchbox, m.get(0).get("mobile"));
}

@When("user click the search button")
public void user_click_the_search_button() {
	WebElement searchbtn=driver.findElement(By.xpath("//input[@type='submit']"));
	clickbutton(searchbtn);

}

@Then("user will navigate to the product page")
public void user_will_navigate_to_the_product_page() {
	System.out.println("user enetered the product page");
}


	

}
