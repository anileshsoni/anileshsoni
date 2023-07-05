package com.LearnTesting.mvn.StepDef;

import org.openqa.selenium.By;

import com.app.utility.FrameworkConstants;
import com.app.webdriver.BrowserManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SampleSteps {

	BrowserManager browser = new BrowserManager();

	@Given("I go to  \"(.*?)\" in chrome browser")
	public void gotoURL(String url) {
		browser.createDriver("chrome");
		browser.openURL(url);
	}

	@And("I enter first name and last name")
	public void clickStep() {
		FrameworkConstants.browser.findElement(By.name("firstname")).sendKeys("FirstName");
		FrameworkConstants.browser.findElement(By.name("lastname")).sendKeys("LastName");
	}

	@And("I select gender as \"(.*?)\"")
	public void selectGender(String gender) {
		if (gender.equals("male"))
			FrameworkConstants.browser.findElement(By.name("sex-0")).click();
		else if (gender.equals("female")) {
			FrameworkConstants.browser.findElement(By.name("sex-0")).click();
		} else
			System.out.println("Wrong Gender");

	}

}
