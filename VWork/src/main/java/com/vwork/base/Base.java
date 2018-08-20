package com.vwork.base;

import org.openqa.selenium.WebDriver;

import com.vwork.datahandler.IDataReader;


public class Base {
	
    static public IDataReader testdataReader;
	public IDataReader configReader;
	public WebDriver driver;
	public String datafilepath;
	public String testcasename;
}
