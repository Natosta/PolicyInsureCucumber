package com.policy.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import basePage.BasePage;

public class EnterAccountInfoPage extends BasePage {

	private static WebDriver driver;
	
	
	
	
	@FindBy(xpath = "//input[@name='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName']") 
	 WebElement FirstName;
	
	
	@FindBy(xpath = "//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']") 
	 WebElement SurnNmae;
	
	
	@FindBy(xpath = "//*[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\"]")
	 WebElement PostCode;
	
	
	
	@FindBy(xpath = "//a[@class='bigButton']")
	 WebElement Search;
	
	
	@FindBy(xpath = "//span[@id='NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl']")
	 WebElement Create;
	
	@FindBy(xpath = "//a[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-itemEl']")
	 WebElement Person;
			
	
public EnterAccountInfoPage(WebDriver driver) {
		
		super(driver);
	
  }


   public EnterAccountInfoPage First() {
	   FirstName.sendKeys("Rod");
	   return this;
}

   
   public EnterAccountInfoPage Second() {
	   SurnNmae.sendKeys("Mike");
	   return this;
}

   public EnterAccountInfoPage PostCode() {
	   PostCode.sendKeys("NE65 0GR");
	   return this;
   }
   
   
   public EnterAccountInfoPage Src() {
	   Search.click();
	   return this;
   }
   
   
   
   public EnterAccountInfoPage CreateUser() {
	   Create.click();
	   return this;
   }
   
   
   /*
   public CreateAccountPage Select() {
	   Person.click();
	 return new CreateAccountPage(driver);
	   }
	*/ 
   
   
   public CreateAccountPage ClickPerson() {
	   Person.click();
	   return new CreateAccountPage(driver);
   }
   
   
  
   /*
   public EnterAccountInfoPage selectValue(String sValue)
   {
     Select oSelect = new Select(Person);
     oSelect.selectByVisibleText(sValue);
     return new EnterAccountInfoPage (driver);
   }		 

  */
  
   
   
}


