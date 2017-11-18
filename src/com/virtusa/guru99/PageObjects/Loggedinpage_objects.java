package com.virtusa.guru99.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loggedinpage_objects {
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")
	public WebElement mywishlistbtn;
	
	@FindBy(xpath="//button[@title='Add to Cart']")
	public WebElement addtocartbtn;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div/div/div[1]/ul/li/button")
	public WebElement proceedtocheckoutbtn;
	
	@FindBy(xpath=".//*[@id='email']")
	public WebElement emailidtxt;
	
	@FindBy(xpath=".//*[@id='pass']")
	public WebElement pwdtxt;
	
	@FindBy(xpath=".//*[@id='send2']")
	public WebElement loginbtn;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")
	public WebElement myorders;
	
	@FindBy(xpath=".//*[@id='my-orders-table']/tbody/tr/td[6]/span/a[1]")
	public WebElement vieworders_myorders;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")
	public WebElement printorders;
	
	@FindBy(xpath=".//*[@id='my-orders-table']/tbody/tr/td[6]/span/a[2]")
	public WebElement reorderoptn;
	
	public Loggedinpage_objects(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	

}
