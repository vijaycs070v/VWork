package com.vwork.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.vwork.datahandler.DataReader;




public class Utility {

	static String pathPropertyFile="./src/com/initg/configuration/path.property";
	static DataReader pathReader;
	static WebDriver driver;
	static{
		try {
			pathReader=new DataReader(pathPropertyFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver(String browsertype)
	{
			
			switch(browsertype)
			{
				case "CHROME":
					System.setProperty("webdriver.chrome.driver", "");
					driver=	new ChromeDriver();
					break;
					
				case "FIREFOX":
					System.setProperty("webdriver.gecko.driver", "");
					driver=	new ChromeDriver();
					break;
					
				case "IE":
					System.setProperty("webdriver.ie.driver", "");
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
