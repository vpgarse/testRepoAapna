package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	private  WebDriver driver;
	private ElementUtil elementUtil;
	//1. create all locators and 2. perform the action
	
	By username= By.id("input-email");
	By password= By.id("input-password");
	By loginbtn=By.xpath("//input[@class='btn btn-primary']");
	By forgottenpwsd= By.xpath("//div[@class='form-group']/a");
	
	// constructor 
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		elementUtil =new ElementUtil(this.driver);
		
	}
	
	
	
	
	// Action Methods
	public String getLoginPageTitle() {
	
		return elementUtil.waitForTitleIsToLoad(5, "Account Login");
	}
	
	public boolean isforgotPasswordDisplayed()
	{
		return elementUtil.doIsDisplayed(forgottenpwsd);
	}
	
	public AccountPage doLogin() {
	
		elementUtil.doSendKeys(username, Constants.USer_ID);
		elementUtil.doSendKeys(password, Constants.USer_PASSWORD);
		elementUtil.doClick(loginbtn);
		
		return new AccountPage(driver);
	}

}
