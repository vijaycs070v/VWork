package com.vwork.pages;

import org.openqa.selenium.By;

import com.initg.base.Base;
import com.initg.base.BasePage;

public class LoginPage extends Base {
	
	public static By userID=By.xpath("");
	public static By password=By.xpath("");
	public static By clickSubmitButton=By.xpath("");
	
	public void getID()
	{
		//driver.findElement(userID).sendKeys(getValue("userId"));
	//	System.out.println(getValue("name"));
	//	System.out.println(testdataReader.readData("name"));
		System.out.println(testdataReader.readData("name"));
		//return this;
	}
	/*public LoginPage getPassword()
	{
		driver.findElement(password).sendKeys(getValue("password"));
		return this;
	}
	public void clickSubmitButton()
	{
		driver.findElement(clickSubmitButton).click();
	}*/

}
