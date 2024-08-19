package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class HomepageTest extends Testbase {
	
	Loginpage loginpage;
	Homepage homepage;
	Contactspage contactspage;
	com.crm.qa.pages.companiespage companiespage;
	com.crm.qa.pages.dealpage dealpage;
    
	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

//	@Test(priority=1)
//	public void verifyContactsPageNavigation() {
//		contactspage = homepage.clickContactlink();
//		Assert.assertNotNull(contactspage, "Failed to navigate to Contacts page.");
//		// Additional assertions can be added to validate the Contacts page state.
//	}
//
//	
//	@Test(priority=2)
//	
//	public void verifydealpage()
//	{
//		dealpage = homepage.clickdeals();
//		Assert.assertNotNull(dealpage, "Failed to navigate to Contacts page.");
//
//	}
	
	
	
	
	@Test
	
	public void verifycompaniespagenavigation()
	{
		companiespage = homepage.clickcompanieslink()
;		Assert.assertNotNull(companiespage, "Failed to navigate to companiespage page.");
}
//	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}
