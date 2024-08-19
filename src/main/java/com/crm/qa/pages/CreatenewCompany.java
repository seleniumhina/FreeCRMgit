package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class CreatenewCompany extends Testbase {

	@FindBy(xpath="(//button[normalize-space()='Create'])[1]")
	WebElement createcompany;
    @FindBy(name = "name")
    private WebElement nameField;

    @FindBy(xpath = "(//i[@class='dropdown icon'])[6]")
    private WebElement statusDropdown;

    @FindBy(xpath = "(//div[@name='status'])[3]")
    private WebElement activeStatus;

    @FindBy(name = "annual_revenue")
    private WebElement revenueField;

    @FindBy(xpath = "(//input[@name='image'])[1]")
    private WebElement imageUpload;
    
    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    private WebElement savebtn;
    
    

    // Constructor
    public CreatenewCompany() {
        PageFactory.initElements(driver, this);
    }

    // Method to add a company
    public companiespage addCompany(String name, String revenue, String filePath) {
        
    	
    	createcompany.click();
    	nameField.sendKeys("neete");
        statusDropdown.click();
        activeStatus.click();
        revenueField.sendKeys("5656");
        imageUpload.sendKeys(filePath);
        savebtn.click();
        return new companiespage();
    }
}
