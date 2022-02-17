package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	 private WebDriver driver; // no other class access this driver
	 DriverFactory df;
	 public LoginPage loginpage;
	 
	@BeforeTest
	public void setup()
	{
		 df=new DriverFactory();
		 driver=df.init_driver("chrome"); // stored in my driver
	     loginpage=new LoginPage(driver);
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
