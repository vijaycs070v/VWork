package com.vwork.base;


import java.net.MalformedURLException;

import com.vwork.datahandler.DataReader;
import com.vwork.utils.RemoteExecution;
import com.vwork.utils.Utility;

public  class BaseTest extends Base {
	String testcase;
	
public BaseTest()
	{
		
		configReader=new DataReader(Utility.getPath("configreader"));
		
	}

public void setUP(String tcname)
	{
		if(tcname==null)
		{
			testcase=this.getClass().getSimpleName();
			
		}
		else
		{
			testcase=tcname;
			
		}
		
		testdataReader=new DataReader(Utility.getPath("testdata"), testcase);
		
	}

public  void initTestDahaReader()
{
	
}

public void launchBrowser() throws MalformedURLException
{
	if(configReader.readData("RemoteExecution").equalsIgnoreCase("true"))
	{
		driver=RemoteExecution.getRemoteWebDriver();
	}
	
	else
	{
		driver=Utility.getDriver(configReader.readData("Browser"));
	}
}

}
