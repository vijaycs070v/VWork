package com.vwork.pages;

import org.openqa.selenium.By;
import com.vwork.base.BasePage;


public class LoginPage extends BasePage {
	
	private static final By userId=By.xpath("");
	private static final By password=By.xpath("");
	private static final By clickSubmitButton=By.xpath("");
	
	public LoginPage enterUserID() throws Exception
	{
		try{
				String id=getValue("userId"); //read user id  value from csv file
				elementWait(userId);
				driver.findElement(userId).sendKeys(id);
		}
		catch(Exception e)
		{
			
			
				throw new Exception("Error at the class "+this.getClass().getSimpleName()+"  User id field "+e.getMessage());
			
		}
		return this;
	}
	public LoginPage enterPassword() throws Exception
	{
		try{
				String pwd=getValue("password"); //read password  value from csv file
				elementWait(password);
				driver.findElement(password).sendKeys(pwd);
				
		}
		catch(Exception e)
		{
			
				throw new Exception("Error at the class "+this.getClass().getSimpleName()+"  Password field "+e.getMessage());
			
		}
		
		return this;
	}
	public void clickSubmitButton() throws Exception
	{
		try{
		
			elementWait(clickSubmitButton);
			driver.findElement(clickSubmitButton).click();
		}
		catch(Exception e)
		{
			throw new Exception("Error at the class "+this.getClass().getSimpleName()+"  Submit button "+e.getMessage());
		}
	}

}
