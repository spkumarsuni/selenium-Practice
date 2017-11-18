package com.virtusa.guru99.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tvpageobjects {
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
	public WebElement addtowishbtnlg;
	
	@FindBy(xpath=".//*[@id='wishlist-view-form']/div/div/button[1]")
	public WebElement sharewishlistbtn;
	
	@FindBy(xpath=".//*[@id='email_address']")
	public WebElement emailidtxt;
	
	@FindBy(xpath=".//*[@id='message']")
	public WebElement messagetxtbox;
	
	@FindBy(xpath=".//*[@id='form-validate']/div[2]/button")
	public WebElement sharewishlist_btn;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")
	public WebElement sharemsgtxt;
	
	public tvpageobjects(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
