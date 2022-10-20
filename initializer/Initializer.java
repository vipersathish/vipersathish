package com.TrueTech.ScreenIT.NewFlow.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	
		
	/**
	 * @author 
	 * @date
	 * @purpose environment variable declared
	 */
	
	
	public static FileInputStream negativefis = null;
	
	public static Properties negativeprop = null;
	
	
	public static FileInputStream envfis = null;
	
	public static Properties envprop= null;
	
	/**
	 * 
	 * 
	 */
	public static FileInputStream sendkeysfis = null ;
	
	public static Properties sendkeysprop = null ;
	
	/**
	 * 
	 * 
	 * @purpose locator variables declared
	 */
	
	public static FileInputStream locatorfis = null;
	
	public static Properties locatorprop = null;
	
	/**
	 * @purpose driver initilize
	 */
	
	public static WebDriver driver = null;
	
	/**
	 * 
	 * 
	 * @throws IOException
	 * @purpose initialize env, locator, webdriver variables
	 */
	
	
	public static void initialize() throws IOException{
		
		 envfis = new FileInputStream(new File("config\\env.properties"));
		
		 envprop = new Properties();
		
		envprop.load(envfis);
		
		
		 locatorfis = new FileInputStream(new File("config\\locator.properties"));
			
		 locatorprop = new Properties();
		
		locatorprop.load(locatorfis);
		
		
		sendkeysfis = new FileInputStream(new File("config\\senkeys.properties"));
		
		sendkeysprop = new Properties();
		
		sendkeysprop.load(sendkeysfis);
		
		
		negativefis = new FileInputStream(new File("config\\negative.properties"));
		
		negativeprop = new Properties();
		
		negativeprop.load(negativefis);
		
		
		if(envprop.get("BROWSER").equals("chrome")){
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			
			Reporter.log("The chrome browser is open now");
			
		}else if(envprop.get("BROWSER").equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
		}else if(envprop.get("BROWSER").equals("ie")){
			
			WebDriverManager.iedriver().setup();
			
			driver = new InternetExplorerDriver();
			
		}
	
		
		driver.manage().window().maximize();
		
		Reporter.log("The browser is maximize");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
		
}
	
		
		
	
		
		
		
	
	
	
}
