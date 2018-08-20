package com.vwork.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vwork.base.BaseTest;
import com.vwork.flow.Flow;


public class FirstSeleniumScriptTest extends BaseTest{

	String tcname;
	@BeforeMethod
	public void setUp()
	{
		super.setUP(tcname);
		
	}
	
	@Test
	public void firstTest()
	{
		Flow f=new Flow();
		f.FirstSeleniumScriptTest();
	}
}
