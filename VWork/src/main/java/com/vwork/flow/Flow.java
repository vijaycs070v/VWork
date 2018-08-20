package com.vwork.flow;

import com.initg.pages.LoginPage;

public class Flow {

	public void FirstSeleniumScriptTest()
	{
		loginPageEnterValuesAndSublit();
	}
	
	public void loginPageEnterValuesAndSublit()
	{
		LoginPage lp=new LoginPage();
		lp.getID();
		//.getPassword().clickSubmitButton();
	}
}
