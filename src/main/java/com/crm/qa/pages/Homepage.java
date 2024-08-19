package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Homepage extends Testbase{
	
	private static final String xpath = null;

	@FindBy(xpath="(//i[@class='users icon'])[1]")
	WebElement contacts;
	
	@FindBy(xpath="(//i[@class='plus inverted icon'])[2]")
	WebElement Addcontact;
	
	@FindBy(xpath="//a[@href='/deals']")
	WebElement deals;
	
	

	@FindBy(xpath="(//span[contains(text(),'Companies')])[1]")
	WebElement companies;
	
	

public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
public Contactspage clickContactlink()
{
	contacts.click(); 
	return new Contactspage();
	
}

public void clickOnAdd()


{
	Actions action  =new Actions(driver);
	action.moveToElement(contacts).build().perform();
	Addcontact.click();	

}


public dealpage clickdeals()
{
	deals.click();
	return new dealpage();
}


public companiespage clickcompanieslink()
{

	companies.click();
	return new companiespage();
}


	
	
	
	
	
}


