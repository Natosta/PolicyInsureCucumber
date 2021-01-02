package com.policy.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class RiskAnalysisPage extends BasePage 
{
	static WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:Next-btnInnerEl\"]") 
	WebElement Rev;

	
	public RiskAnalysisPage(WebDriver driver)
	{
		super(driver);
	}
		
	  
     public PolicyReviewPage GetT() {
    	 Rev.click();
	    return new PolicyReviewPage(driver);
    }
	


}
