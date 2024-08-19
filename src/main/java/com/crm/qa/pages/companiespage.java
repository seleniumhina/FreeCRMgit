package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class companiespage extends Testbase {

	
	@FindBy(xpath="(//button[normalize-space()='Create'])[1]")
	WebElement createcompany;
	
	@FindBy(xpath="(//button)[24]")
	WebElement delete;
	
	@FindBy(xpath="(//button[normalize-space()='Delete'])[1]")
	WebElement clickdelete;
	

	public companiespage()
	{
		
		PageFactory.initElements(driver, this);
	
}
	 public CreatenewCompany verifycreatecompany()
	 {
		 
		 createcompany.click();
		 return new CreatenewCompany();

	 }
	
public companiespage verifydelete()
{
	delete.click();
	clickdelete.click();
	return new companiespage();
}

}