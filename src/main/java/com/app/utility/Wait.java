package com.app.utility;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public void implicitWaitMilliSecond(long TimeOut) {
		FrameworkConstants.browser.manage().timeouts().implicitlyWait(Duration.ofMillis(TimeOut));
	}
	
	public WebDriverWait ExplicitWait(long timeout) {
		return new WebDriverWait(FrameworkConstants.browser, Duration.ofMillis(timeout));
	}
}
