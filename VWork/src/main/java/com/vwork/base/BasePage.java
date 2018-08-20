package com.vwork.base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Base {

	WebDriverWait wait=new WebDriverWait(driver,30);
	
	public String getValue(String key)
	{
		return testdataReader.readData(key);
	}
	public void elementWait(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
}
