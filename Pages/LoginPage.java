package com.TrueTech.ScreenIT.NewFlow.Pages;

import org.testng.Reporter;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class LoginPage {
	
	
	public static void enterEmail(String Email){
		
		DriverFunctions.getElementByXpath("LOGINPAGE_TYPE_EMAILID_XPATH").sendKeys(Email);
		
		Reporter.log("Loginpage Enter the Email-- "+Email );
		
	}
	
	public static void enterPassword(String Password){
		
		DriverFunctions.getElementByXpath("LOGINPAGE_TYPE_PASSWORD_XPATH").sendKeys(Password);
		
		Reporter.log("Loginpage Enter the Password --"+ Password);
	}
	
	public static void clickSigninButton(){
		
		DriverFunctions.getElementByXpath("LOGINPAGE_CLICK_SIGNINBUTTON_XPATH").click();
		
		Reporter.log("Loginpage click the loginbutton navigate to the dashboradpage");
	}


}
