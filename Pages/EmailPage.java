package com.TrueTech.ScreenIT.NewFlow.Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class EmailPage  {

			
	
	public static void OpenNewTab(){
		
		JavascriptExecutor js = (JavascriptExecutor)DriverFunctions.driver;
		js.executeScript("window.open()");
		

		
	Set<String> lists =	DriverFunctions.driver.getWindowHandles();
	
	Iterator<String> it = lists.iterator();
	
	while(it.hasNext()){
		
	String wind1=	 it.next();
	String wind2=	 it.next();
	
	DriverFunctions.driver.switchTo().window(wind2);
		
	}
	
		
	}
	
	public static void enterEmail(String email){
		
		DriverFunctions.getElementByXpath("EMAILPAGE_TYPE_EMAIL_XPATH").sendKeys(email);
	}
	
	public static void enterNextButton(){
		
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_NEXTBUTTON_XPATH").click();
	}
	
	public static void enterPassword(String pass){
		
		DriverFunctions.getElementByXpath("EMAILPAGE_TYPE_PASSWORD_XPATH").sendKeys(pass);
		
		
	}
	
	public static void clickSignin() throws InterruptedException{
		
		Thread.sleep(3000);
		
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_SIGNINBUTTON_XPATH").click();
	}
	

	public static void enterSendItems() throws InterruptedException{
		
		Thread.sleep(5000);
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_SENTITEMS_XPATH").click();
	}
	    
	public static void clickScheduleRequest() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_SCHEDULEMAIL_XPATH").click();
		
	}
	
	public static void clickLink() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_CLICKLINK_XPATH").click();
	}
	
	public static void clickAcceptorDecline(String text) throws InterruptedException{
		
		Thread.sleep(4000);
		
		Set<String> lists =	DriverFunctions.driver.getWindowHandles();
		
		Iterator<String> it = lists.iterator();
		
		while(it.hasNext()){
			
		String wind1=	 it.next();
		String wind2=	 it.next();
		String wind3 = it.next();
		
		DriverFunctions.driver.switchTo().window(wind3);
			
		}
		
	List<WebElement> list = DriverFunctions.getElementsByXpath("EMAILPAGE_CLICK_ACCEPTORDECLINE_XPATH");
	
	for(int i=0;i<list.size();i++){
		
		String data = list.get(i).getText();
		
		if(data.equals(text)){
			
			list.get(i).click();
		}
	}
	
	
	}
	
	public static void retrunBackOriginalWindow(){
		
	Set<String> lists =	DriverFunctions.driver.getWindowHandles();
		
		Iterator<String> it = lists.iterator();
		
		while(it.hasNext()){
			
		String wind1=	 it.next();
		String wind2=	 it.next();
		String wind3 = it.next();
		
		DriverFunctions.driver.switchTo().window(wind1);
		
	}
	
	}
	
	public static void BackToMail(){
		
Set<String> lists =	DriverFunctions.driver.getWindowHandles();
		
		Iterator<String> it = lists.iterator();
		
		while(it.hasNext()){
			
		String wind1=	 it.next();
		String wind2=	 it.next();
		String wind3 = it.next();
		
		DriverFunctions.driver.switchTo().window(wind2);
		
		
	}
	}
	
	public static void clickInterviewSchedule() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_SCHEDULEINTERVIEW_XPATH").click();
	}
	
	public static void clickInterviewLink(){
		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverFunctions.driver;
		js1.executeScript("window.scrollBy(0,-1000)", "");

		
		DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_INTERVIEWLINKS_XPATH").click();
	}
	
	
	public static void retrunToMeeting() throws InterruptedException{
		
		Thread.sleep(3000);
		
  Set<String> windows =	DriverFunctions.driver.getWindowHandles();
		
		List<String> windowindex = new ArrayList<String>(windows);
		
		String focuswindow = windowindex.get(3);
		
		DriverFunctions.driver.switchTo().window(focuswindow);
		
		}
	
	
	public static void enterName(String name) throws InterruptedException{
		
		Thread.sleep(3000);
		DriverFunctions.getElementByXpath("EMAILPAGE_TYPE_NAME_XPATH").sendKeys(name);
	}
	
	public static void enterMeetingId(){
		
		WebElement id = DriverFunctions.getElementByXpath("EMAILPAGE_ENTER_MEETINGID_XPATH");
		
	String data =	id.getText();
	
	String meetingid = data ;
	
	String[] str =meetingid.split(":");
	
	
	
	for(int i=0;i<str.length;i++){
		
	String	 sm = str[1];
	
		
		System.out.println(sm);
		
		
	WebElement idlink =	DriverFunctions.getElementByXpath("EMAILPAGE_TYPE_MEETINGID_XPATH");
	
	idlink.click();
	
	idlink.sendKeys(sm);
		
		break;
	}
	
	}
}
