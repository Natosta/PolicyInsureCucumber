package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


import com.policy.pages.HomePage;

import basePage.BasePage;

public class HomePage extends BasePage {
	
	static WebDriver driver;
	
	@FindBy(linkText = "Statistical Data Return") 
	 WebElement SDRLinkText;
	
	@FindBy(id = "//*[@id=\"ext-element-1\"]") 
	 WebElement txt_InvalidLoginErrMsg;
	
	
	@FindBy(xpath="//*[@id=\"ext-element-1\"]")
	WebElement Settings;
	
	@FindBy(xpath="//*[@id=\"ext-element-1\"]")
	WebElement logOutButton;
	
	
	
	// Policy Centre begin Here 
	@FindBy(xpath = "//span[@id='Desktop:DesktopMenuActions-btnEl']")
	 WebElement ActionMenu;
	
	@FindBy(id = "Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-itemEl")
	 WebElement Newaccount;
	
	
	
	
	
	@FindBy(css = "#Desktop\\3a DesktopMenuActions\\3a DesktopMenuActions_Create\\3a DesktopMenuActions_NewAccount-textEl") 
	 WebElement Proceed;
	
	
	@FindBy(how=How.ID,using="id=TabBar:AccountTab-btnWrap")
	WebElement PolicyDrop;
	
	@FindBy(how=How.CSS,using="#Desktop\\3a DesktopMenuActions-btnInnerEl")
	WebElement policyBtn;
	
	@FindBy(how=How.CSS,using="#Desktop\\3a DesktopMenuActions\\3a DesktopMenuActions_Create\\3a DesktopMenuActions_NewSubmission-textEl")
	WebElement newSubmissionBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	public boolean verifyInvalidLoginErrMsg()
	{
		return txt_InvalidLoginErrMsg.isDisplayed();
		
	}
	
	public static String verifyHomePageTitle(){
		return BasePage.getPageTitle();
	}
	
	 public LoginPage Sett() {
		
		Settings.click();
		return new LoginPage(driver);
	}
	
	
     public LoginPage logOut() {
		
		logOutButton.click();
		return new LoginPage(driver);
	}
	
	
    
	


   // Policy Centre begins Here 
    public HomePage ClickActt() {
	 ActionMenu.click();
	   return new HomePage(driver);
}    
   
    
     public PolicyInfoPage ClickNew() {
    	 Newaccount.click();
		   return new PolicyInfoPage(driver);
   }


     public HomePage selectValue(String sValue)
     
     {
      Select oSelect = new Select(ActionMenu);
      oSelect.selectByVisibleText(sValue);
     return new HomePage (driver);
  }		 

  	
     
     
     
     
     
     
     
}
