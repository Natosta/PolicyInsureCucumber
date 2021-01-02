package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

  public class QuotePage extends BasePage
   {
	
static WebDriver driver;
  	
   @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl\"]") 
   WebElement QuoteButton;

   @FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']") 
   WebElement NextToPament;
   
   @FindBy(xpath = "//*[@id=\"ext-element-369\"]/div/div") 
   WebElement InstalmentOption;
   
   @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV_tb:Add-btnInnerEl\"]") 
   WebElement AcctAddButton;
   

   @FindBy(xpath = "//*[@id=\"SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV_tb:Add-btnInnerEl\"]") 
   WebElement AcctType;
   
   @FindBy(xpath = "//li[normalize-space()='Individual']") 
   WebElement IndividualPerson;
   
   @FindBy(xpath = "//*[@id=\"privacy-1825-inputEl\"]") 
   WebElement AcctNumber;
   
   @FindBy(xpath = "//*[@id=\"ext-element-678\"]") 
   WebElement StCode;
   
   @FindBy(xpath = "//*[@id=\"radio-3130-inputEl\"]") 
   WebElement ChBoxTick;
   
   
   
   
   
   
   
   
   public QuotePage(WebDriver driver) {

   super(driver);
   }

  
   public QuotePage GetQuotePrice() {
   QuoteButton.click();
   return new QuotePage(driver);
   }
  
   public PaymentPage PayPage() {
   NextToPament.click();
   return new PaymentPage(driver);
   }
   
   public PaymentPage Install() {
	   InstalmentOption.click();
   return new PaymentPage(driver);
   }
  
   public PaymentPage AddAcctDetaails() {
	   AcctAddButton.click();
   return new PaymentPage(driver);
   }
  

   public PaymentPage AcctTypeDropDown() {
	   AcctType.click();
   return new PaymentPage(driver);
   }
  
   public PaymentPage SelectPerson() {
	   IndividualPerson.click();
   return new PaymentPage(driver);
   }
  
   public PaymentPage ValidateAccout() {
	   AcctNumber.click();
   return new PaymentPage(driver);
   }
  
   public PaymentPage ValidateSortCode() {
	   StCode.click();
   return new PaymentPage(driver);
   }
   
   public PaymentPage IsAccountYours() {
	   ChBoxTick.click();
   return new PaymentPage(driver);
   }
   
   
   
   
   
   
   
   
   
   
   
   
  }

