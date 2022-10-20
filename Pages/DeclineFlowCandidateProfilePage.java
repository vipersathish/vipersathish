package com.TrueTech.ScreenIT.NewFlow.Pages;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class DeclineFlowCandidateProfilePage {
	
	
	public static void ClickReschedule() throws InterruptedException{
		
	Thread.sleep(3000);
	
	DriverFunctions.getElementByXpath("DECLINEFLOW_CANDIDATEPAGE_CLICK_RESCHEDULE_XPATH").click();
		
	}
	
	
	

}
