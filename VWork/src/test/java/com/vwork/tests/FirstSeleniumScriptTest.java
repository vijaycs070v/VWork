package com.vwork.tests;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vwork.base.BaseTest;
import com.vwork.flow.Flow;


public class FirstSeleniumScriptTest extends BaseTest{

	String tcname;
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUP(tcname);
		launchBrowser();
		login();
		
	}
	
	@Test
	public void firstTest() throws Exception
	{
		Flow f=new Flow();
		f.FirstSeleniumScriptTest();
	}
}
