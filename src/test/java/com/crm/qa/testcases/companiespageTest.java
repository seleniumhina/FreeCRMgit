package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.CreatenewCompany;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;


public class companiespageTest extends Testbase {

    Loginpage loginpage;
    Homepage homepage;
    com.crm.qa.pages.companiespage companiespage; // Corrected type name
    CreatenewCompany createnewCompany;

    public companiespageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginpage = new Loginpage();
        homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
        companiespage = homepage.clickcompanieslink(); // Ensure correct method name
        createnewCompany = new CreatenewCompany(); // Assuming a method to navigate to the CreateNewCompany page
    }

//    @Test
//    public void verifyAddCompanyTest() {
//        String name = "Neeta";
//        String revenue = "5667";
//        String filePath = "C:\\Users\\hinai\\Pictures\\Saved Pictures\\png.jpg"; // Fixed path syntax
//        createnewCompany.addCompany(name, revenue, filePath);
//        // Add assertions here to verify that the company was added successfully
//    }
    
    @Test
    public void company()
    {  
    	companiespage.verifycreatecompany();
    }
    
    @Test
    public void delete()
    {  
    	companiespage.verifydelete();
    }
    
    
}
