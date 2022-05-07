package com.app.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	
	WebDriver browser = null;

	
	public WebDriver createDriver(String browserType) {
		
		if(browserType == "chrome") {
			WebDriverManager.chromedriver().setup();
			browser = new ChromeDriver();	
		}
		if(browserType == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			browser = new ChromeDriver();	
		}
		if(browserType == "ie") {
			WebDriverManager.iedriver().setup();
			browser = new ChromeDriver();	
		}
		if(browserType == "opera") {
			WebDriverManager.operadriver().setup();
			browser = new ChromeDriver();	
		}
		browser.manage().window().maximize();
		return browser;
	}
	
	
}
