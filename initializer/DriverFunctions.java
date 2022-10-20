package com.TrueTech.ScreenIT.NewFlow.initializer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DriverFunctions extends Initializer{

	

	public static void getElementById() {

	}

	public static void getElementByName() {

	}

   
	public static WebElement getElementByXpath(String xpath) {
		try{
	return	driver.findElement(By.xpath( locatorprop.getProperty(xpath)));
	}catch(Exception e){
		
		System.out.println(e.getLocalizedMessage());
	}
  return null;
	}
	
	
	public static List<WebElement> getElementsByXpath(String lists){
		
		try{
	return	driver.findElements(By.xpath(locatorprop.getProperty(lists)));
		
	}catch(Exception e){
		
		System.out.println(e.getLocalizedMessage());
	}
		return null;
	}

	
	

}
