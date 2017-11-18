package com.virtusa.guru99.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.virtusa.guru99.pages.Browsersetup;

public class Homepageobjects extends Browsersetup{
	
	public  WebDriver driver;
	
	@FindBy(xpath=".//*[@id='nav']/ol/li[1]/a")
	public WebElement mobilemenuoption;
	
	@FindBy(xpath=".//*[@id='nav']/ol/li[2]/a")
	public WebElement tvmenuoption;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div/h2")
	public WebElement pagetitletext;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")
	public WebElement dropdownmenuoption;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
	public WebElement addtocomparesony;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
	public WebElement addtocompareiphone;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button")
	public WebElement comparebtn;
	
	@FindBy(xpath=".//*[@id='product_comparison']/tbody[1]/tr[1]/td[1]/h2/a")
	public WebElement sonyxperiatext_popupwindow;
	
	@FindBy(xpath=".//*[@id='product_comparison']/tbody[1]/tr[1]/td[2]/h2/a")
	public WebElement iphonetext_popupwindow;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[3]/div/div[4]/ul/li[1]/a")
	public WebElement myaccountlink;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button")
	public WebElement addtocartiphone;
	
	@FindBy(xpath=".//*[@id='coupon_code']")
	public WebElement discountCodestxtbox;
	
	@FindBy(xpath=".//*[@id='discount-coupon-form']/div/div/div/div/button")
	public WebElement applybtn;
	
	@FindBy(xpath=".//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[1]")
	public WebElement discounttxtfield;
	
	@FindBy(xpath=".//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span")
	public WebElement discountamounttxt;
	
	public Homepageobjects()
	{
		Browserselection("firefox","http://live.guru99.com");	
		this.driver=getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void performDiscountTest() {
		mobilemenuoption.click();
		
		addtocartiphone.click();
		
		discountCodestxtbox.sendKeys("GURU50");
		
		applybtn.click();
		
		System.out.println(discounttxtfield.getText() +"amount is " + discountamounttxt.getText());
	}
	
	public void mobilemenuoptionclick()
	{
		mobilemenuoption.click();
	}
	
	public String pagetitle()
	{
		return pagetitletext.getText();
	}
}
