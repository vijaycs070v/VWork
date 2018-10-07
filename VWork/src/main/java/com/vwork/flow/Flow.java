package com.vwork.flow;

import org.openqa.selenium.WebDriver;

import com.vwork.pages.LoginPage;

public class Flow {

	WebDriver driver;
	
	public void FirstSeleniumScriptTest() throws Exception
	{
		loginPageEnterValuesAndSublit();
	}
	
	public void loginPageEnterValuesAndSublit() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserID().enterPassword().clickSubmitButton();
	}
}
