package com.policy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import basePage.BasePage;

public class LoginPage extends BasePage {
	
	static WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]") 
	 WebElement txt_UserName;
	
	@FindBy(xpath = "//*[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]") 
	 WebElement txt_password;
	
	@FindBy(xpath = "//*[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]") 
	 WebElement submitBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	public LoginPage enterUserName(String username) {
		
		txt_UserName.sendKeys(username);
		return this;
	}
	
public LoginPage enterUserPassword(String password) {
		
		txt_UserName.sendKeys(password);
		return this;
	}
	


	public HomePage login(String username, String password) {
		
		txt_UserName.sendKeys(username);
		txt_password.sendKeys(password);
		//submitBtn.click();
		return new HomePage(driver);
	}
	
	public HomePage clickLoginBtn() {
		submitBtn.click();
		return new HomePage(driver);
	}
	
	





}
