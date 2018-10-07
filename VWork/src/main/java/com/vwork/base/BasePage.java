package com.vwork.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vwork.enums.GlobalConstants;

public abstract class BasePage extends Base {

	WebDriverWait wait;
	
	public String getValue(String key)
	{
		return testdataReader.readData(key);
	}
	public void elementWait(WebElement userId, int timeout) {
		wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(userId));
	}
	
	public void elementWait(WebElement userId) {
		int timeout=Integer.parseInt(GlobalConstants.EXPLICITWAIT_TIME.getValue());
		wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(userId));
	}
	
	
	protected abstract void waitForPageLoad();
}
