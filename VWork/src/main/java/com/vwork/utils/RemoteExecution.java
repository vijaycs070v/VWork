package com.vwork.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.vwork.enums.GlobalConstants;

public class RemoteExecution {

	static String USERNAME;
	static String ACCESS_KEY;
	static WebDriver driver;
	public RemoteExecution() {

		USERNAME=GlobalConstants.SAUCELAB_USERNAME.getValue();
		ACCESS_KEY=GlobalConstants.SAUCELAB_ACCESS_KEY.getValue();
		
	}
	
	public static WebDriver getRemoteWebDriver() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		cap.setCapability(CapabilityType.PLATFORM, Platform.WIN8);
		
		String URL="https://"+USERNAME+":"+ACCESS_KEY+"@www.saucelabs.com:443/wd/hub";
		URL url=new URL(URL);
		
		driver=new RemoteWebDriver(url,cap);
		return driver;
	}
	
}
