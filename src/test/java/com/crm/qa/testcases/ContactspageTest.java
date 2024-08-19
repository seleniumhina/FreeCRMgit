package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.util.Testutil;

public class ContactspageTest extends Testbase {

    Loginpage loginpage;
    Homepage homepage;
    Contactspage contactspage;
    String sheetname = "contacts";
    
    public ContactspageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginpage = new Loginpage();
        homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
        contactspage = homepage.clickContactlink(); // Ensure this method exists and returns a Contactspage instance
    }

    @Test(priority=1)
    public void verifyContactNameTest() {
        Assert.assertTrue(contactspage.contactLabelLink());   
    }

    @DataProvider
    public Object[][] getCRMTestData() {
        Object data[][] = Testutil.getTestData(sheetname);
        return data;	
    }
    
    @Test(dataProvider = "getCRMTestData")
    public void verifyAddContactLink(String firstname, String lastname) {
        homepage.clickOnAdd();  // Navigate to the add contact page
        contactspage.addContactLink(firstname, lastname);  // Add the contact using the data from the Excel sheet
    }
}
