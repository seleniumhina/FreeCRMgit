package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class dealpage extends Testbase{
	
	@FindBy(xpath="//a[@href='/deals']")
	WebElement deals;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]")
	WebElement pipeline;
	
	@FindBy(xpath="(//i[@class='dropdown icon'])[3]")
	WebElement selectfield;
	
	@FindBy(xpath="(//span[normalize-space()='Amount'])[1]")
	WebElement Amount;
	
	@FindBy(xpath="(//input[@name='pipeline_name'])[1]")
	WebElement pipelinename;
	
	@FindBy(xpath="(//button[@class='ui primary button'][normalize-space()='Create'])[1]")
	WebElement createpipelinebtn;

	@FindBy(xpath="(//button[normalize-space()='Create'])[1]")
	WebElement createbtn;
	
	
	
	
	
	
	public dealpage()
	{
        PageFactory.initElements(driver, this);

	}

	public DealPipeline createpipeline()
	{    this.deals.click();
		this.pipeline.click();
		this.selectfield.click();
		this.Amount.click();
		this.pipelinename.sendKeys("Firstpipe");
		this.createpipelinebtn.click();
	return new DealPipeline();
		
	}
	
	public CreatenewDeal createnewpipeline()
	{   this.deals.click();
		this.createbtn.click();
		return new CreatenewDeal();

		
	}

}
