package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import basePage.BasePage;

public class AccountPage extends BasePage {
	
	static WebDriver driver;
	
	
	//@FindBy(xpath = "//*[@id=\"Desktop:DesktopMenuActions-btnEl\"]") 
	// WebElement Action;
	
	 @FindBy(id = "CreateAccount:CreateAccountScreen:Update-btnInnerEl") 
	 WebElement UpdateButton;
	
	 @FindBy(xpath = "//span[@id='AccountFile:AccountFileMenuActions-btnInnerEl']") 
	 WebElement AcctNewSubmit;
	
	 
	 

	 
	
    public AccountPage(WebDriver driver) {
		
		super(driver);		
    }
    
    
    
    
    public AccountPage CreateAccount() {
    	UpdateButton.click();
   	   return new AccountPage(driver);
     }
      
    public AccountPage Action() {
    	AcctNewSubmit.click();
   	   return new AccountPage(driver);
     }
      
    
    
    
    
    
 //  public AccountPage selectValue(String sValue)
   /*
   {
    Select oSelect = new Select(Action);
    oSelect.selectByVisibleText(sValue);
   return new AccountPage (driver);
}		 

	
*/

}
