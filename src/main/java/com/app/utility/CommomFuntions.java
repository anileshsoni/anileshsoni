package com.app.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;


public class CommomFuntions {
	
	WebDriver driver;
	
	public void userClicks(By element) {
		driver.findElement(element).click();
	}
	
	/**
	 * 
	 * @param element : Pass element (By)
	 * @param selectType : How user want to select the dropdown item, eg: index,value,visibleText
	 * @param index: if selectType is index than pass index
	 * @param value: if selectType is value than pass value
	 */
	public void userSelectDropdownBy(By element, String selectType, int index, String value) {
		Select dropdown = null;
		try {
			dropdown = new Select(driver.findElement(element));
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
		try {
			if(selectType.equals("index")) {
				dropdown.selectByIndex(index);
			}else if(selectType.equals("value")) {
				dropdown.selectByValue(value);
			}else if(selectType.equals("text")) {
				dropdown.selectByVisibleText(value);
			}else {
				// Default Selection
				dropdown.selectByIndex(0);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	
	public void enterText(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	
	
	
	public void handleAlert() {
		
	}
	

}
