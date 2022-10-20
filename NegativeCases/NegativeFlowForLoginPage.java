package com.TrueTech.ScreenIT.NewFlow.NegativeCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.TrueTech.ScreenIT.NewFlow.Pages.LoginPage;
import com.TrueTech.ScreenIT.NewFlow.initializer.Initializer;

public class NegativeFlowForLoginPage extends Initializer{
	
	
	
	@BeforeSuite
	
	public void setup() throws IOException{
		
		initialize();
		
	}
	
	@Test(priority=1 , description = "positive credentials")
	
	public void loginValidData() throws IOException{
		
		
		driver.get(envprop.getProperty("LOGINURL"));
       
	  LoginPage.enterEmail(negativeprop.getProperty("LOGINPAGE_ENTER_EMAIL"));
	  
	  LoginPage.enterPassword(negativeprop.getProperty("LOGINPAGE_ENTER_PASSWORD"));
	  
	  LoginPage.clickSigninButton();
	  
		
	}
	
	@Test(priority=2 , description = "negative creditals")
	
	public static void loginInvalidEmailAndValidPassword() throws IOException{
		
	
		driver.get(envprop.getProperty("LOGINURL"));
	       
		  LoginPage.enterEmail(negativeprop.getProperty("LOGINPAGE_ENTER_INVALIDEMAIL"));
		  
		  LoginPage.enterPassword(negativeprop.getProperty("LOGINPAGE_ENTER_VALIDPASSWORD"));
		  
		  LoginPage.clickSigninButton();
		
	}
	
	
   @Test(priority=3 , description = "negative credentials")
	
	public static void loginValidEmailAndInValidPassword() throws IOException{
		
	
		driver.get(envprop.getProperty("LOGINURL"));
	       
		  LoginPage.enterEmail(negativeprop.getProperty("LOGINPAGE_ENTER_VALIDEMAIL"));
		  
		  LoginPage.enterPassword(negativeprop.getProperty("LOGINPAGE_ENTER_INVALIDPASSWORD"));
		  
		  LoginPage.clickSigninButton();
		
   }
   
   @Test(priority=4 , description = "negative credentials")
	
  	public static void loginEmptyEmailAndEmptyPassword() throws IOException{
  		
  	
  		driver.get(envprop.getProperty("LOGINURL"));
  	       
  		  LoginPage.enterEmail(negativeprop.getProperty("LOGINPAGE_ENTER_EMPTYEMAIL"));
  		  
  		  LoginPage.enterPassword(negativeprop.getProperty("LOGINPAGE_ENTER_EMPTYPASSWORD"));
  		  
  		  LoginPage.clickSigninButton();   

   }
   
  @ AfterMethod
   
   public void teardown() throws IOException{
	   
	  File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenITFlow.DDD\\Screenshot.png"));
			
   }
}
