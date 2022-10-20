package com.TrueTech.ScreenIT.NewFlow.Pages;

import org.openqa.selenium.WebElement;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class NegativeflowDashboardpage {
	
	
	public static void Primaryskills() throws InterruptedException{
		
		Thread.sleep(5000);
     WebElement skill =DriverFunctions.getElementByXpath("DASHBOARDPAGE_PRIMARYSKILLS");
     
     String data = skill.getText();
     
     System.out.println("Not click primary skills"+data);
		
	}
	
	public static void jobdescription() throws InterruptedException{
		
		Thread.sleep(5000);
		
		WebElement job =  DriverFunctions.getElementByXpath("DASHBOARDPAGE_JOBDESCRIPTION");
		
		String data = job.getText();
		
		System.out.println("Not type job description"+data);
	}

}
