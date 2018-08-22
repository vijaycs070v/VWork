package com.vwork.flow;

import com.vwork.pages.LoginPage;

public class Flow {

	public void FirstSeleniumScriptTest() throws Exception
	{
		loginPageEnterValuesAndSublit();
	}
	
	public void loginPageEnterValuesAndSublit() throws Exception
	{
		LoginPage lp=new LoginPage();
		lp.enterUserID().enterPassword().clickSubmitButton();
	}
}
