package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class PolicyReviewPage  extends BasePage 
{
	static WebDriver driver;
	
	 @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl\"]") 
	 WebElement GetPremium;
	
	
	public PolicyReviewPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	 public QuotePage Quote() {
	 GetPremium.click();
	 return new QuotePage(driver);
	 }    
	
	
	

}
