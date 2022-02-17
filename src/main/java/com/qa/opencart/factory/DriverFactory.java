package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	WebDriver driver;
	public WebDriver init_driver(String browsername) {
		System.out.println("Browser launch is : "+browsername);
		if (browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firfox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not Supported "+ browsername);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		return driver;
	}

}
