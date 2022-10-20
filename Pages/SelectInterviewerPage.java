package com.TrueTech.ScreenIT.NewFlow.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class SelectInterviewerPage {

	
	public static void selectAllinterviewer() throws InterruptedException{

		
	       DriverFunctions.getElementByXpath("SELECTINTERVIEWERPAGE_CLICK_ALLINTERVIWERS_XPATH").click();
	}
	
	
	public static void interviewerDoneButton() throws InterruptedException{

		Thread.sleep(3000);
		
	       DriverFunctions.getElementByXpath("SELECTINTERVIEWERPAGE_CLICK_ALLINTERVIWERS_XPATH").click();
	}
	
	
	
	
	public static void selectSingleinterviewer(String num) throws InterruptedException{
		
		Thread.sleep(10000);
		
	List<WebElement> lists =	DriverFunctions.getElementsByXpath("SELECTINTERVIEWERPAGE_CLICK_SINGLEINTERVIWER_XPATH");
	
	int value = Integer.parseInt(num);
	
	 for(int i=0;i<lists.size();i++){
		
		
		if(i==value){
			
			lists.get(i).click();
		}
	}
	
	WebElement donebtn = DriverFunctions.getElementByXpath("SELECTINTERVIEWERPAGE_VIEW_BACKICON_XPATH");
	
	Thread.sleep(3000);
	
	((JavascriptExecutor) DriverFunctions.driver).executeScript("arguments[0].scrollIntoView(true);", donebtn);
	
	
	
	}
	
	public static void selectMultiinterviewers(int num,int num1,int num2){
		
		List<WebElement> lists =	DriverFunctions.getElementsByXpath("SELECTINTERVIEWERPAGE_CLICK_SINGLEINTERVIWER_XPATH");
		
		for(int i=0;i<lists.size();i++){
			
			if(i==num){
				
				lists.get(i).click();
			}
			
			if(i==num1){
				
				lists.get(i).click();
			}
			
			if(i==num2){
				
				lists.get(i).click();
			}
		}
		
	}
	
	public static void scrollup(){
		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverFunctions.driver;
		js1.executeScript("window.scrollBy(0,-1000)", "");

	}
	
	public static void scrolldown(){
		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverFunctions.driver;
		js1.executeScript("window.scrollBy(0,1000)", "");

	}
	
	
	
	
	
	 
}
