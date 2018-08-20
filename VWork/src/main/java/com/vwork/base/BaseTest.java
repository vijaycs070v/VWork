package com.vwork.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.initg.datahandler.DataReader;
import com.initg.datahandler.IDataReader;
import com.initg.utils.BrowserType;
import com.initg.utils.Utility;

public  class BaseTest extends Base {
	String testcase;
	
public BaseTest()
	{
		
		configReader=new DataReader(Utility.getPath("configreader"));
		//driver=Utility.getDriver(configReader.readData("Browser"));
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

public void initBrowserDriver(String browsername)
{
	
}

}
