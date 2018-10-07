package com.vwork.enums;

public enum GlobalConstants {
PATHPROPERTYFILE("./src/com/initg/configuration/path.property"),
SAUCELAB_USERNAME(""),
SAUCELAB_ACCESS_KEY(""),
EXPLICITWAIT_TIME("30");
	
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
