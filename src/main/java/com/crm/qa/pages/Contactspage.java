package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Contactspage extends Testbase {

    @FindBy(xpath = "(//span[@class='selectable '])[1]")
    WebElement contactlabel;

    @FindBy(xpath = "//div[@id='main-nav']//div[3]//button[1]//i[1]")
    WebElement createbutton;

    @FindBy(name = "first_name")
    WebElement firstnamefield;

    @FindBy(name = "last_name")
    WebElement lastnamefield;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement savebtn;

    // Constructor
    public Contactspage() {
        PageFactory.initElements(driver, this);
    }

    // Method to verify contact label is displayed
    public boolean contactLabelLink() {
        return contactlabel.isDisplayed();
    }

    // Method to add a new contact
    public void addContactLink(String firstname, String lastname) {
        this.firstnamefield.sendKeys(firstname);  // Enter the first name
        this.lastnamefield.sendKeys(lastname);    // Enter the last name
        savebtn.click();                     // Click the save button to add the contact
    }
}
