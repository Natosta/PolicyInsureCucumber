package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class NewSubmissionsPage extends BasePage {

	private static WebDriver driver;



	
    @FindBy(id = "AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl") 
	WebElement Submission;
	
	
	

   public NewSubmissionsPage(WebDriver driver) {
	
	super(driver);

   }

   public NewSubmissionsPage First() {
	   Submission.click();
	   return this;
   }
	  
	   
	   
  }


