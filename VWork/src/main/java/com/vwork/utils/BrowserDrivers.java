package com.vwork.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDrivers {
	WebDriver driver;
	
	public  WebDriver getDriver(BrowserType browsertype)
	{
		
		switch(browsertype)
		{
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "");
				driver=	new ChromeDriver();
				break;
				
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", "");
				driver=	new ChromeDriver();
				break;
				
			case IE:
				System.setProperty("webdriver.ie.driver", "");
				driver=	new ChromeDriver();
				break;
			default:
				System.out.println("Provide a valid browser name");
				break;
		}
		
		return driver;
	}

}
