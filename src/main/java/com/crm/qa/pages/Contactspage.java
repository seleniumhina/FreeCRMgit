package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.Testbase;

public class Contactspage extends Testbase {

    @FindBy(xpath = "//div[@id='main-nav']//div[3]//button[1]//i[1]")
    private WebElement createButton;

    @FindBy(name = "first_name")
    private WebElement firstNameField;

    @FindBy(name = "last_name")
    private WebElement lastNameField;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    private WebElement saveButton;

    // Constructor
    public Contactspage() {
        PageFactory.initElements(driver, this);
    }

    // Method to add a new contact
//    public void addContact(String firstName, String lastName) {
//        try {
//            // Ensure the fields and save button are displayed before interacting
//            if (firstNameField.isDisplayed() && lastNameField.isDisplayed() && saveButton.isDisplayed()) {
//                firstNameField.sendKeys(firstName);  // Enter the first name
//                lastNameField.sendKeys(lastName);    // Enter the last name
//                saveButton.click();                  // Click the save button to add the contact
//            } else {
//                System.out.println("One or more elements are not displayed.");
//            }
//        } catch (Exception e) {
//            // Log the exception
//            System.err.println("An error occurred while adding the contact: " + e.getMessage());
//        }
//    }
}
