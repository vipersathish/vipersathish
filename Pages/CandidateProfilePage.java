package com.TrueTech.ScreenIT.NewFlow.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class CandidateProfilePage {
	
	
	public static void selectInterviewer() throws InterruptedException{
		
		Thread.sleep(3000);
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_SELECTINTERVIEWER_XPATH").click();
		
		Reporter.log("Select the interviewer");
	}
	
	public static void uploadResumeButton() throws InterruptedException{
		
		Thread.sleep(3000);
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_UPLOADRESUME_XPATH").click();
		
		Reporter.log("click the uploadResume button");
	}
	
	public static void uploadCandidateResume(String file) throws AWTException, InterruptedException{
		
		Thread.sleep(3000);
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_UPLOADCANDIDATERESUME_XPATH").click();
		
		Thread.sleep(3000);
		
		StringSelection ss = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		
		Reporter.log("upload candidate resume");
	}
	
	public static void candidateSubmit() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_CANDIDATSUBMIT_XPATH").click();
	}
	
	public static void candidateStatus1() throws InterruptedException{
		
		Thread.sleep(5000);
		
		WebElement status1 = DriverFunctions.getElementByXpath("CANDIDATEPAGE_DISPLAYED_STATUSCARD_XPATH");

		String data1 = status1.getText();
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(data1, "New");

		System.out.println("status----" + data1);
		
		Reporter.log("status should be --- "+data1);
	}
	
	public static void setAvailability() throws InterruptedException{
		
		Thread.sleep(3000);
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_SETAVAILABILITY_XPATH").click();
		
		Reporter.log("click the set availability");
		
	}
	
	public static void clickSelectdata() throws InterruptedException{
		
		Thread.sleep(3000);
	
		try{
		
			DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_SELECTDATE_XPATH").click();
			
		}catch(Exception e){
			
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public static void selectDate(String date) throws InterruptedException{
		
		Thread.sleep(2000);
		List<WebElement> lists = DriverFunctions.getElementsByXpath("CANDIDATEPAGE_CLICK_SELECTCURRENTDATE_XPATH");
		
		for(int i=0;i<lists.size();i++){
			
		String data =	lists.get(i).getText();
		
		if(data.equals(date)){
			
			lists.get(i).click();
		}
		}
		Thread.sleep(2000);
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_OKBUTTON_XPATH").click();
		
		Reporter.log("Choose the data");
	}
	
	public static void selectTime(String time) throws InterruptedException{
		
	List<WebElement> lists = DriverFunctions.getElementsByXpath("CANDIDATEPAGE_CLICK_SELECTTIME_XPATH");
	
	for(int i=0;i<lists.size();i++){
		
	String data= lists.get(i).getText();
	
	if(data.equals(time)){
		
		lists.get(i).click();
	}
	}
	
	Reporter.log("choose the time");
	}
	
	public static void selectSec(String sec){
	
	  List<WebElement> lists1= DriverFunctions.getElementsByXpath("CANDIDATEPAGE_CLICK_SELECTMINUTES_XPATH");
	
	  for(int i=0;i<lists1.size();i++){
		  
	String data1= lists1.get(i).getText();
	
	if(data1.equals(sec)){
		
		lists1.get(i).click();
	}
	  }
	  
	  Reporter.log("choose the seconds");
	}
	public static void selectSuffix(String suffix){
	  
	     List<WebElement> lists2=  DriverFunctions.getElementsByXpath("CANDIDATEPAGE_CLICK_SELECTSUFFIX_XPATH");
	     
	     for(int i=0;i<lists2.size();i++){
	    	 
	    	 String data2 = lists2.get(i).getText();
	    	 
	    	 if(data2.equals(suffix)){
	    		 
	    		 lists2.get(i).click();
	    	 }
	    			 
	     }
	     
	     DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_OKBUTTON_XPATH").click();
	     
	     DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_SUMBITSETAVAILABILITY_XPATH").click();
	     
	     Reporter.log("choose the suffix");
	}
	
	public static void candidatestatus2() throws InterruptedException{
		
		Thread.sleep(4000);
		
		WebElement status1 = DriverFunctions.getElementByXpath("CANDIDATEPAGE_DISPLAYED_STATUSCARD_XPATH");

		String data1 = status1.getText();
		
		System.out.println("status---"+data1);
		
		Reporter.log("status should be ---"+data1);
	}
	
	public static void candidateDetails() throws InterruptedException{
		
		Thread.sleep(3000);
		
	WebElement details =	DriverFunctions.getElementByXpath("CANDIDATEPAGE_CANDIDATEDETAILS_XPATH");
	
	    String data = details.getText();
	    
	    System.out.println(data);
	    
	    Reporter.log("candidate details----"+data);
	
	}
	
	public static void clickCandidateInformation() throws InterruptedException{
		
		Thread.sleep(3000);
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_RESUMEDOWNLOAD_XPATH").click();
		
		Thread.sleep(2000);
	   DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_CANDIDATENAME_XPATH").click();
	   
	   Thread.sleep(2000);
	   
	   DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_EDITBUTTON_XPATH").click();

		
	}
	
	public static void editCandidateInfo(String startname ) throws InterruptedException{
		
	WebElement clearname = 	DriverFunctions.getElementByXpath("CANDIDATEPAGE_EDITNAME_XPATH");
	
	clearname.clear();
	
	clearname.sendKeys(startname);
	
	}
	
	public static void editcandidateinfoendname(String endnameedit){
		
	WebElement endname = DriverFunctions.getElementByXpath("CANDIDATEPAGE_EDITENDNAME_XPATH");
	
	endname.clear();
	
	endname.sendKeys(endnameedit);
	
	DriverFunctions.getElementByXpath("CANDIDATEPAGE_SUMBIT_XPATH").click();
	
	}
	
	
	public static void candidateStatus3() throws InterruptedException{
		
		
		  Thread.sleep(50000);
		  
		  DriverFunctions.driver.navigate().refresh();
		  
		  Thread.sleep(2000);
       
		try{
				 
		WebElement status1 = DriverFunctions.getElementByXpath("CANDIDATEPAGE_DISPLAYED_STATUSCARD_XPATH");

		String data1 = status1.getText();
		
		System.out.println("status---"+data1);
		
		Reporter.log("status should be ---"+data1);
		
	}catch(StaleElementReferenceException e){
		
		
		System.out.println(e.getLocalizedMessage());
	}
		
	}
	
	public static void candidateStatus4() throws InterruptedException{
		
		
		Thread.sleep(80000);
		
		DriverFunctions.driver.navigate().refresh();
	
		Thread.sleep(3000);
	
		try{
			
			
			WebElement status1 = DriverFunctions.getElementByXpath("CANDIDATEPAGE_DISPLAYED_STATUSCARD_XPATH");

			String data1 = status1.getText();
			
			System.out.println("status---"+data1);
			
			
		Reporter.log("status should be---"+data1);	
		
	}catch(StaleElementReferenceException e){
		
		
		System.out.println(e.getLocalizedMessage());
	}
	
	}
	
	public static void candidateStatus5() throws InterruptedException{
		
		
		Thread.sleep(100000);
		
		DriverFunctions.driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		try{
			
			
			WebElement status1 = DriverFunctions.getElementByXpath("CANDIDATEPAGE_DISPLAYED_STATUSCARD_XPATH");

			String data1 = status1.getText();
			
			System.out.println("status---"+data1);
			
			Reporter.log("status should be ---"+data1);
			
		}catch(StaleElementReferenceException e){
			
		
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
	
	public static void clickStatus() throws InterruptedException{
		
		
		try{
			
		Thread.sleep(6000);
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_STATUS_XPATH").click();
		
		}catch(Exception e){
			
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public static void viewStatus() throws InterruptedException{
		
	WebElement view =	DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_FEEDBACK_XPATH");
		
		((JavascriptExecutor) DriverFunctions.driver).executeScript("arguments[0].scrollIntoView(true);", view);
		
		Thread.sleep(3000);
		
			DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_FEEDBACK_XPATH").click();
	}
	
	public static void switchwindow() throws InterruptedException{
		
		
	Set<String>	windows =  DriverFunctions.driver.getWindowHandles();
	
	Iterator<String> it = windows.iterator();
	
	while(it.hasNext()){
		
		String window1 = it.next();
		
		String window2 = it.next();
		
		DriverFunctions.driver.switchTo().window(window2);
		
		JavascriptExecutor js = (JavascriptExecutor) DriverFunctions.driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverFunctions.driver;
		js1.executeScript("window.scrollBy(0,-1500)", "");
		
		Thread.sleep(2000);
		
		DriverFunctions.driver.switchTo().window(window1);
		
		Thread.sleep(7000);
		
		
		JavascriptExecutor js2 = (JavascriptExecutor) DriverFunctions.driver;
		js2.executeScript("window.scrollBy(0,-1000)", "");
		
	}
		
	}
	
	public static void clickCloseButton(){
		
		DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_CLOSEWINDOW_XPATH").click();
	}

	public static void selectCandidadate() throws InterruptedException{
		
	DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_SELECTBUTTON_XPATH").click();
	
	Thread.sleep(3000);
	
	DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_POPUP_XPATH").click();
	 
	}
	
	public static void RejectCandidate() throws InterruptedException{
		
	DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_REJECTBUTTON_XPATH").click();	
		
	Thread.sleep(3000);
	
	DriverFunctions.getElementByXpath("CANDIDATEPAGE_CLICK_POPUP_XPATH").click();
	}
	
	
	public static void CandidateRejectStatus() throws InterruptedException{
		
		Thread.sleep(3000);
		
	WebElement status =	DriverFunctions.getElementByXpath("CANDIDATEPAGE_VIEWSTATUS_REJECTED_XPATH");
	
	String data = status.getText();
	
	System.out.println("status--"+data);
	
	Reporter.log("status should be-- "+data);
	
	
	}
	
	public static void candidateStatus6() throws InterruptedException{
	
		try{
		
	WebElement status =	DriverFunctions.getElementByXpath("CANDIDATEPAGE_VIEWSTATUS_XPATH");
	
	  String data =status.getText();
	  
	  System.out.println(data);
		
	  Thread.sleep(3000);
	  
	  Reporter.log("status should be --"+data);
	  
	  DriverFunctions.driver.navigate().refresh();
	
	}catch(Exception e){
		
		DriverFunctions.getElementByXpath("//div[text()=' Selected ']").click();
		System.out.println(e.getLocalizedMessage());
	}
	}
	
	public static void refreshingPage(){
		
		DriverFunctions.driver.navigate().refresh();
	}

	
}
