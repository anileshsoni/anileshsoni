package com.app.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.app.utility.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	
	public WebDriver createDriver(String browserType) {
		
		if(browserType == "chrome") {
			WebDriverManager.chromedriver().setup();
			FrameworkConstants.browser = new ChromeDriver();	
		}
		if(browserType == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			FrameworkConstants.browser = new ChromeDriver();	
		}
		if(browserType == "ie") {
			WebDriverManager.iedriver().setup();
			FrameworkConstants.browser = new ChromeDriver();	
		}
		if(browserType == "opera") {
			WebDriverManager.operadriver().setup();
			FrameworkConstants.browser = new ChromeDriver();	
		}
		FrameworkConstants.browser.manage().window().maximize();
		return FrameworkConstants.browser;
	}
	
	public WebDriver openURL(String url) {
		if(!url.isBlank())
			FrameworkConstants.browser.get(url);
		else
			System.out.println("no url found");
		return FrameworkConstants.browser;
	}
	
}
