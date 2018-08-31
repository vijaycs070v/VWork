package com.vwork.base;

import org.openqa.selenium.WebDriver;

import com.vwork.datahandler.IDataReader;


public class Base {
	
	public static  IDataReader testdataReader;
	public static IDataReader configReader;
	public WebDriver driver;
	public String datafilepath;
	public String testcasename;
}
