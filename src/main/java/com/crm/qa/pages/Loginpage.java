package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase{

	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//div[@class='ui fluid large blue submit button'])[1]")
	WebElement loginbtn;
	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public Homepage login(String un, String pwd)
	{
		email.sendKeys("hinainamdar678@gmail.com");
		password.sendKeys("Arsalan@786");
		loginbtn.click();
		return new	 Homepage();
		
		
	}
} 
