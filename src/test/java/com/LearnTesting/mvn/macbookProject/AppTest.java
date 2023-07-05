package com.LearnTesting.mvn.macbookProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import com.app.utility.*;
import com.app.webdriver.BrowserManager;

public class AppTest 
{
    BrowserManager browser = new BrowserManager();
    
    @Test
    public void timesheet() throws InterruptedException
    {
    	// Locators
    	By username = By.id("unamebean");
    	By password = By.id("pwdbean");
    	By btn_submitLogin = By.id("SubmitButton");
    	By timecardmenu = By.xpath("//*[@id=\"treemenu1\"]/li/a");
    	By createTimeCard = By.xpath("//*[@id=\"SLK_IN_SOFT_Self_Service_TimeRecent_TimecardsCreate_TimecardTemplates\"]/li[2]/a");
    	
        browser.createDriver("chrome");
        
        Wait w = new Wait();
        
        browser.openURL("https://webnucleus.slkgroup.com/OA_HTML/RF.jsp?function_id=28716&resp_id=-1&resp_appl_id=-1&security_group_id=0&lang_code=US&oas=RfBhsp2zQAP5JaQKqz103w..&params=KQ0ueFd3h5ncJDQ0.532EQ");
        
        FrameworkConstants.browser.findElement(username).sendKeys("anilesh.soni");
        FrameworkConstants.browser.findElement(password).sendKeys("ActOne@110668!");
        FrameworkConstants.browser.findElement(btn_submitLogin).click();
        
        FrameworkConstants.browser.findElement(timecardmenu).click();
        Thread.sleep(2000);
        FrameworkConstants.browser.findElement(createTimeCard).click();
        Thread.sleep(2000);
        FrameworkConstants.browser.findElement(By.xpath("//*[@id=\"A251N1display\"]")).click();
        Thread.sleep(2000);
        FrameworkConstants.browser.findElement(By.xpath("//*[@id=\"A251N1display\"]")).sendKeys("01");
        Thread.sleep(2000);
        FrameworkConstants.browser.findElement(By.id("Hxccuitcsaveforlater")).click();
        Thread.sleep(2000);
        FrameworkConstants.browser.findElement(By.id("review")).click();
        
        
        Thread.sleep(200000);
    }
    
    @AfterClass(alwaysRun = true)
    protected void tearDown() {
    	FrameworkConstants.browser.quit();
    	FrameworkConstants.browser = null;
    }
}
