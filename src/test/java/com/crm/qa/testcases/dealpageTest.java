package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.CreatenewDeal;
import com.crm.qa.pages.DealPipeline;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.dealpage;

public class dealpageTest extends Testbase {

    Loginpage loginpage;
    Homepage homepage;
    Contactspage contactspage;
    dealpage dealpage;// Properly declare dealpage
    com.crm.qa.pages.dealpage dealPipeline;
    CreatenewDeal createnewDeal;
    
	private DealPipeline DealPipeline;
	public dealpageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();  // Initialize the driver and other properties
        loginpage = new Loginpage(); // Initialize the Loginpage object
        homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); // Perform login
    //    contactspage = homepage.clickContactlink();
        dealpage = new dealpage(); // Initialize the dealpage object after login
    }

    @Test
    public void verifydealpipelinepage() {
    	DealPipeline = dealpage.createpipeline(); // Call createpipeline method
        // Assuming some condition to verify the pipeline creation
        // Replace the assertion with a meaningful check
        Assert.assertNotNull(DealPipeline, "Pipeline creation failed, Homepage not loaded.");
    }
    
    @Test
    public void verifycreatenewpipelinepage() {
    	createnewDeal = dealpage.createnewpipeline();
      //  Assert.assertNotNull(createnewdeal, "Pipeline creation failed, creatdealepage not loaded.");
    
    
    
}}
