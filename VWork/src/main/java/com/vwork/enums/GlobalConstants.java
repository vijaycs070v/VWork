package com.vwork.enums;

public enum GlobalConstants {
PATHPROPERTYFILE("./src/com/initg/configuration/path.property");
	
private	String value;
private GlobalConstants(String value)
{
	this.value=value;
}

public String getValue()
{
	return value;
}
}
