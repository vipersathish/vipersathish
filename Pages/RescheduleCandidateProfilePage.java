package com.TrueTech.ScreenIT.NewFlow.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class RescheduleCandidateProfilePage {


	public static void reschedule(){
		
		try{
		DriverFunctions.getElementByXpath("RESCHEDULEFLOW_CANDIDATEPAGE_CLICK_RESCHEDULE_XPATH").click();
			
	}catch(Exception e){
		
		System.out.println(e.getLocalizedMessage());
	}
		
	}
	
	public static void selectReason(String text) throws InterruptedException{
		
		Thread.sleep(5000);
		
  WebElement reason = DriverFunctions.getElementByXpath("RESCHEDULEFLOW_CANDIDATEPAGE_CHOOSE_SELECTREASON_XPATH");
    
  Select s = new Select(reason);
  
  s.selectByVisibleText(text);
  
	}
	
	public static void comment(String comments){
		
		DriverFunctions.getElementByXpath("RESCHEDULEFLOW_CANDIDATEPAGE_TYPE_COMMENTS_XPATH").sendKeys(comments);
	}
	
	public static void cancel(){
		
		DriverFunctions.getElementByXpath("RESCHEDULEFLOW_CANDIDATEPAGE_CLICK_CANCEL_XPATH").click();
	}
	
	public static void clickSubmit() throws InterruptedException{
		
		Thread.sleep(3000);
		DriverFunctions.getElementByXpath("RESCHEDULEFLOW_CANDIDATEPAGE_CLICK_SUBMIT_XPATH").click();
	     
	}
	
}

