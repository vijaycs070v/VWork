package com.vwork.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.vwork.datahandler.DataReader;
import com.vwork.enums.GlobalConstants;




public class Utility {
	static DataReader pathReader;
	static WebDriver driver;
	static{
		try {
			pathReader=new DataReader(GlobalConstants.PATHPROPERTYFILE.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver(String browsertype)
	{
			
			switch(browsertype)
			{
				case "CHROME":
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					driver=	new ChromeDriver();
					break;
					
				case "FIREFOX":
					System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
					driver=	new ChromeDriver();
					break;
					
				case "IE":
					System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
					driver=	new ChromeDriver();
					break;
				default:
					System.out.println("Please check browser name (CHROME,FIREFOX,IE)");
					break;
			}
			
			return driver;
		}
	

	public static String getPath(String propertyname)
	{
		return pathReader.readData(propertyname);
	}
}
