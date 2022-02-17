package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.utils.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		
		String title = loginpage.getLoginPageTitle();
		System.out.println("Login Page title : "+title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	
	}
	@Test(priority = 2)
	public void forgotPasswordLinkTest()
	{
		Assert.assertTrue(loginpage.isforgotPasswordDisplayed());
	}

	@Test(priority = 3)
	public void doLoginTest()
	{
		loginpage.doLogin();
		
	}
}
