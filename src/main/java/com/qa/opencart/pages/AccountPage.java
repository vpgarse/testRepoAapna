package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.ElementUtil;

public class AccountPage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	By searchArea=By.xpath("//input[@name='search']");
	By searchBtn=By.xpath("//button[@class='btn btn-default btn-lg']");
	By acctHeaders=By.xpath("//div[@id='content']/h2");
	
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		elementUtil = new ElementUtil(this.driver);
		
	}
	
	public String getAccountHomePageTitle()
	{
		return elementUtil.waitForTitleIsToLoad(5, "My Account");
	}

	public int getaccountPageHeader()
	{
		return elementUtil.getElements(acctHeaders).size();
	}
	public void getAccountPageHeadersList() {
		
		List<WebElement> accountHeasersList = elementUtil.getElements(acctHeaders);
		
		List<String> headerList=new ArrayList<>();
		
		for(WebElement list:accountHeasersList)
		{
			headerList.add(list.getText());
		}
	}
}
