package com.TrueTech.ScreenIT.NewFlow.NegativeCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.TrueTech.ScreenIT.NewFlow.Pages.DashBoardPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.LoginPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.NegativeflowDashboardpage;
import com.TrueTech.ScreenIT.NewFlow.initializer.Initializer;

public class NegativeFlowforDashboardPage extends Initializer {
	
	
	@BeforeSuite
	
	public void setup() throws IOException{
		
		initialize();
	}
	
	
	@Test(priority=1)
	
	public void login(){
		
		driver.get(envprop.getProperty("LOGINURL"));
		
		LoginPage.enterEmail(sendkeysprop.getProperty("LOGINPAGE_ENTER_EMAIL"));
		
		LoginPage.enterPassword(sendkeysprop.getProperty("LOGINPAGE_ENTER_PASSWORD"));
		
		LoginPage.clickSigninButton();
	}
	
	@Test(priority=2)
	
	public void createPost() throws InterruptedException, AWTException{
		
        DashBoardPage.uploadIdButton();
		
		DashBoardPage.uploadJDFile(sendkeysprop.getProperty("DASHBOARDPAGE_UPLOADJDFILE"));

		DashBoardPage.submitButton();
		
		DashBoardPage.clickPost();
		
		NegativeflowDashboardpage.Primaryskills();
		
		NegativeflowDashboardpage.jobdescription();
		
		
		
		
		
	}

}
