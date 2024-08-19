package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.CreatenewCompany;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class CreatenewCompanyTest extends Testbase {

	 Loginpage loginpage;
	    Homepage homepage;
	    com.crm.qa.pages.companiespage companiespage;
	    CreatenewCompany createnewCompany;

	    public CreatenewCompanyTest() {
	        super();
	    }

	    @BeforeMethod
	    public void setup() {
	        initialization();
	        loginpage = new Loginpage();
	        homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	        companiespage = homepage.clickcompanieslink();
	        createnewCompany = new CreatenewCompany();
	    }
	    @Test
	    public void VerifyAddcompanyTest()
	    {
	    	companiespage =createnewCompany.addCompany("String name", "String revenue", "C:\\\\Users\\\\hinai\\\\Pictures\\\\Saved Pictures\\\\png.jpg");
	    	
	    }
	
}
