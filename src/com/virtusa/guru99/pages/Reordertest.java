package com.virtusa.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.virtusa.guru99.PageObjects.BilingPageObjects;
import com.virtusa.guru99.PageObjects.Homepageobjects;
import com.virtusa.guru99.PageObjects.Loggedinpage_objects;

public class Reordertest extends Browsersetup{
	
public static WebDriver driver;
	
Homepageobjects hpb;
	
	@BeforeTest
	public void Browserlaunch()
	{
		Browserselection("firefox", "http://live.guru99.com");
		
		
	}
	
	@Test
	public void reorder() throws Exception
	{
		Loggedinpage_objects logobj= new Loggedinpage_objects(driver);
		
		BilingPageObjects bilobj= new BilingPageObjects(driver);
		
		hpb=new Homepageobjects(driver);
		
		hpb.myaccountlink.click();
		
		logobj.emailidtxt.sendKeys("selenium_testing@gmail.com");
		
		logobj.pwdtxt.sendKeys("guru99@123");
		
		logobj.loginbtn.click();
		
		Thread.sleep(1000);
		
		logobj.myorders.click();
		
		logobj.reorderoptn.click();
		
		bilobj.reorder_proceedtochkoutbtn.click();
		
		bilobj.shiptothisadd_billinginform.click();
		
		bilobj.billinginfo_continuebtn.click();
		
		bilobj.shipngmethod_continuebtn.click();
		
		bilobj.chkmoneyorder_radiobtn.click();
		
		bilobj.pymntcontinuebtn.click();
		
		bilobj.orderreview_placeorderbtn.click();
		
		System.out.println(bilobj.ordrmsg.getText() + "and your order number is" +bilobj.ordernum.getText());
		
		driver.quit();
		
	}

}
