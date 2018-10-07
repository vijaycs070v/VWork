package com.vwork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.vwork.base.BasePage;


public class LoginPage extends BasePage {
	WebDriver driver;
	
	Logger log=Logger.getLogger(LoginPage.class);
	
	@FindBy(how=How.XPATH, using="")
	private WebElement userId;
	
	
	@FindBy(how=How.XPATH, using="")
	private WebElement password;	
	
	
	@FindBy(how=How.XPATH, using="")
	private WebElement clickSubmitButton;	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitForPageLoad();
	}
	
	public LoginPage enterUserID() throws Exception
	{
		try{
			 	log.info("Entering user id...");
				String id=getValue("userId"); //read user id  value from csv file
				elementWait(userId);
				userId.sendKeys(id);
				log.info("User id entered.");
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
				elementWait(password,20);
				password.sendKeys(pwd);
				
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
			clickSubmitButton.click();
		}
		catch(Exception e)
		{
			throw new Exception("Error at the class "+this.getClass().getSimpleName()+"  Submit button "+e.getMessage());
		}
	}
	
	protected void waitForPageLoad() {
		
	}

}
