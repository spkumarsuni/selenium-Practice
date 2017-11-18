package com.virtusa.guru99.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_objects {
	
	WebDriver driver;
	
@FindBy(xpath=".//*[@id='login-form']/div/div[1]/div[2]/a/span/span")
public WebElement createanaccountbtn;

@FindBy(xpath=".//*[@id='firstname']")
public WebElement firstnametxtbox;

@FindBy(xpath=".//*[@id='middlename']")
public WebElement middlenametxtbox;

@FindBy(xpath=".//*[@id='lastname']")
public WebElement lastnametxtbox;

@FindBy(xpath=".//*[@id='email_address']")
public WebElement emailidtxtbox;

@FindBy(xpath=".//*[@id='password']")
public WebElement pwdtxtbox;

@FindBy(xpath=".//*[@id='confirmation']")
public WebElement cfnpwdtxtbox;

@FindBy(xpath=".//*[@id='form-validate']/div[2]/button")
public WebElement registerbtn;

@FindBy(xpath="//*[@id='nav']/ol/li[2]/a")
public WebElement tvoption;

public Registration_objects(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
}
	
}
