package com.virtusa.guru99.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BilingPageObjects {
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='billing:street1']")
	public WebElement addresstxtbox;
	
	@FindBy(xpath=".//*[@id='billing:city']")
	public WebElement citytxtbox;
	
	@FindBy(xpath=".//*[@id='billing:telephone']")
	public WebElement telephonetxtbox;
	
	@FindBy(xpath=".//*[@id='billing-buttons-container']/button")
	public WebElement billinginfo_continuebtn;
	
	@FindBy(xpath=".//*[@id='shipping-method-buttons-container']/button")
	public WebElement shipngmethod_continuebtn;
	
	@FindBy(xpath=".//*[@id='dt_method_checkmo']/label")
	public WebElement chkmoneyorder_radiobtn;
	
	@FindBy(xpath=".//*[@id='payment-buttons-container']/button")
	public WebElement pymntcontinuebtn;
	
	@FindBy(xpath=".//*[@id='review-buttons-container']/button")
	public WebElement orderreview_placeorderbtn;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div/div[1]/h1")
	public WebElement ordrmsg;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div/p[1]/a")
	public WebElement ordernum;
	
	@FindBy(xpath=".//*[@id='billing:country_id']")
	public WebElement countrydropdown;
	
	@FindBy(xpath=".//*[@id='billing:region']")
	public WebElement statedropdown;
	
	@FindBy(xpath=".//*[@id='billing:postcode']")
	public WebElement zipcode;
	
	@FindBy(xpath=".//*[@id='co-billing-form']/div/ul/li[2]/label")
	public WebElement shiptothisaddradiobtn;
	
	@FindBy(xpath=".//*[@id='top']/body/div/div/div[2]/div/div/div/div[1]/ul/li/button")
	public WebElement reorder_proceedtochkoutbtn;
	
	@FindBy(xpath=".//*[@id='co-billing-form']/div/ul/li[3]/label")
	public WebElement shiptothisadd_billinginform;
	
	
	
	
	public BilingPageObjects(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

}
