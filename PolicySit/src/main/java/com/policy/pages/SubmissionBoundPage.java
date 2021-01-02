package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class SubmissionBoundPage extends BasePage
{
	static WebDriver driver;

	

	 @FindBy(css = "#JobComplete\\:JobCompleteScreen\\:JobCompleteDV\\:ViewPolicy-inputEl") 
	   WebElement SubmissionBound;
	 
	
	

	public SubmissionBoundPage(WebDriver driver) {

		super(driver);
		   
		}
			
	
	
	 public SummaryPage Submission() {
		 SubmissionBound.click();
	 return new SummaryPage(driver);
	}
	
	
	
	
	
	
	
	
	
	

}
