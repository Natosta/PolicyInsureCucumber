package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class PaymentPage extends BasePage
{
	static WebDriver driver;
	
	 @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PaymentScreen:UpFrontPaymentDV:PaymentInstrument-trigger-picker\"]") 
	   WebElement ChooseCard;
	
	 @FindBy(xpath = "//li[normalize-space()='Other']") 
	   WebElement SelectCard;
	
	 @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PaymentScreen:UpFrontPaymentDV:IsCardRegistered_true-inputEl\"]") 
	   WebElement CardRegisterdToYou;
	
	 @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PaymentScreen:UpFrontPaymentDV:ElectronicAddButtonLink\"]") 
	   WebElement ProceedWithPayment;	 

	 @FindBy(xpath = "//input[@name='cardnumber']") 
	   WebElement CardLongNumber;
	 
	 @FindBy(xpath = "//select[@name='startmonth']") 
	   WebElement ExpiryStartMonthDW;
	 
	 @FindBy(xpath = "//*[@id=\"carddetails\"]/div[1]/div[5]/div[2]/select/option[7]") 
	   WebElement ExpiryStartMonth;
	 
	 
	 @FindBy(xpath = "//select[@name='expirymonth']") 
	   WebElement ExpiryYearDW;
	 
	 @FindBy(xpath = "//*[@id=\"carddetails\"]/div[1]/div[5]/div[2]/span/select/option[3]") 
	   WebElement ExpiryYear;
	 	
	 @FindBy(xpath = "//input[@name='securitycode']") 
	   WebElement SecurityCode; 
	 
	 @FindBy(xpath = "//a[@id='proceedButton']") 
	   WebElement BuyNow;
	 
	 

	 //Installment Elements: 
	 
	 @FindBy(xpath = "//*[@id=\"ext-element-1341\"]/div/div") 
	  WebElement InstalmentCheck;
	 
	 @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV_tb:Add-btnInnerEl\"]") 
	  WebElement AddButton;
	 
	 
	 
	 
	//*[@id="ext-element-1405"]
	 
	//*[@id="ext-element-1407"]
	 
	//*[@id="radio-5997-inputEl"]
	 

	
	public PaymentPage(WebDriver driver) {

	super(driver);
	   
	}
		
	
	 public PaymentPage CardDp() {
	   ChooseCard.click();
	 return new PaymentPage(driver);
	}
	 	 
	
	 public PaymentPage CardType() {
	   SelectCard.click();
	 return new PaymentPage(driver);
	}
	  
	 public PaymentPage CardCheck() {
	   CardRegisterdToYou.click();
	 return new PaymentPage(driver);
	 }
	
	 
	 public PaymentPage ProceedPay() {
	   ProceedWithPayment.click();
	  return new PaymentPage(driver);
	 }
	

	 public PaymentPage CardNumber() {
	  CardLongNumber.sendKeys("4929 0000 0000 6");
	
	 return new PaymentPage(driver);
	 }
		
	 public PaymentPage StartMontDropDown() {
	  ExpiryStartMonthDW.click();
	 return new PaymentPage(driver);
	}
		
	 public PaymentPage StartMont() {
	  ExpiryStartMonth.click();
	 return new PaymentPage(driver);
	}
		
	 public PaymentPage YearDropDown() {
		 ExpiryYearDW.click();
		  return new PaymentPage(driver);
		 }
		
	 public PaymentPage ExYear() {
		 ExpiryYear.click();
		  return new PaymentPage(driver);
		 }
		
	 public PaymentPage SecurityCode() {
		 SecurityCode.sendKeys("123");
		  return new PaymentPage(driver);
		 }
		
	 public SubmissionBoundPage Purchase() {
		 BuyNow.click();
		  return new SubmissionBoundPage(driver);
		 }
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
}
