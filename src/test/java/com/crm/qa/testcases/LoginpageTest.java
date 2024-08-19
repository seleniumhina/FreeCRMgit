package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class LoginpageTest extends Testbase{
	Loginpage loginpage;
	Homepage homepage;	

	public LoginpageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage= new Loginpage();
	}
	
	@Test
	public void loginTest()
	{
		
	homepage =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
