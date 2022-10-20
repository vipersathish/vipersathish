package com.TrueTech.ScreenIT.NewFlow.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.TrueTech.ScreenIT.NewFlow.initializer.DriverFunctions;

public class DashBoardPage {
	
	
	public static void uploadIdButton() throws InterruptedException{
		
  try {	
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_UPLOADIDBUTTON_XPATH").click();
    }catch(Exception e){
	  
	  System.out.println(e.getLocalizedMessage());
  }
  
    Reporter.log("click the uploadid button");
  
	}
	
	public static void uploadJDFile(String file) throws AWTException, InterruptedException{
		
	try {	
		
		Thread.sleep(3000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_UPLOADJDFILE_XPATH").click();
	
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
		
	}catch(Exception e){
		
		System.out.println(e.getLocalizedMessage());
	}
	
	Reporter.log("candidate resume uploaded");
	}

	public static void submitButton() throws InterruptedException{
		
		Thread.sleep(2000);
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SUBMITBUTTON_XPATH").click();
	}
	
	public static void verifyLabelText(){
	
		try{
			
		SoftAssert s = new SoftAssert();
		
		String actual = DriverFunctions.getElementByXpath("DASHBOARDPAGE_CHECKLABEL_TEXT_XPATH").getText();
		
		s.assertEquals(actual, "Create Interviewer Description ID");
		}	catch (Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public static void selectyear(String year){
		
	WebElement selectyears = DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SELECT_CANDIDATEYEAR_XPATH");
		
	Select s = new Select(selectyears);
	
	s.selectByVisibleText(year);
	
	Reporter.log("select the years");
	}
	
	
	public static void selectmonth(String month){
		
		WebElement selectmonths = DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SELECT_CANDIDATEMONTH_XPATH");
		
		Select s = new Select(selectmonths);
		
		s.selectByVisibleText(month);
		
		Reporter.log("select the months");
	}
	
	
	public static void choosePrimarySkill(String Pskill) throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SELECT_PRIMARYSKILL_XPATH").click();
		
		
	List<WebElement> primarylists = DriverFunctions.getElementsByXpath("DASHBOARDPAGE_CLICK_CHOOSEPRIMARYSKILL_XPATH");
		
	for(int i=0;i<primarylists.size();i++){
		
	String data =	primarylists.get(i).getText();
		
		if(data.equals(Pskill)){
			
			primarylists.get(i).click();
		}
	}
	Reporter.log("choose the primary skills");
	}
	
	public static void chooseSecondarySkill(String Sskill) throws InterruptedException{
		
		Thread.sleep(3000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SELECT_SECONDARYSKILL_XPATH").click();
	
	List<WebElement> secondarylists = DriverFunctions.getElementsByXpath("DASHBOARDPAGE_CLICK_CHOOSESECONDARYSKILL_XPATH");
	
	for(int i=0;i<secondarylists.size();i++){
		
	String data1 =	secondarylists.get(i).getText();
	
	if(data1.equals(Sskill)){
		
		secondarylists.get(i).click();
	}
	}
	
	Reporter.log("choose the secondary skills");
	}
	
	public static void jobDescription(String jd ){
		
	    DriverFunctions.getElementByXpath("DASHBOARDPAGE_TYPE_JOBDESCRIPTION_XPATH").sendKeys(jd);
	    
	    Reporter.log("Type the job description");
	}
	
	
	public static void remark(String remark){
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_TYPE_REMARK_XPATH").sendKeys(remark);
		
		Reporter.log("Type the Remark");
		
	}
	
	public static void clickPost(){
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_POSTBUTTON_XPATH").click();
		
		Reporter.log("create the post");
	}
	
	public static void profilecards(){
		
		try{
		Thread.sleep(30000);
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_PROFILECARDS_XPATH").click();
	}catch(Exception e){
		System.out.println(e.getLocalizedMessage());
	}
	
	}
	
	public static void clickHome() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_HOMEBUTTON_XPATH").click();
	}
	
	public static void clickProfile() throws InterruptedException{
		
		Thread.sleep(6000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_PROFILE_XPATH").click();
		
	}
	
	public static void clickSchedule() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SCHEDULE_XPATH").click();
		
	}
	
	public static void clickSit() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SIT_XPATH").click();
	}
	
	public static void clickSelected() throws InterruptedException{
		
		Thread.sleep(5000);
		
		DriverFunctions.getElementByXpath("DASHBOARDPAGE_CLICK_SELECTED_XPATH").click();
	}
	
	
}
