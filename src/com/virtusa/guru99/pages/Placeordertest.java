package com.virtusa.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.virtusa.guru99.PageObjects.BilingPageObjects;
import com.virtusa.guru99.PageObjects.Homepageobjects;
import com.virtusa.guru99.PageObjects.Loggedinpage_objects;
import com.virtusa.guru99.utils.ReusableMethods;

public class Placeordertest extends Browsersetup {
	
	public static WebDriver driver;

	
	@BeforeTest
	public void Browserlaunch()
	{
		Browserselection("firefox", "http://live.guru99.com");
		
		
	}
	
	
	@Test
	public void placeorder() throws Exception
	{
		
	Loggedinpage_objects logobj= new Loggedinpage_objects(driver);
	
	BilingPageObjects bilobj= new BilingPageObjects(driver);
	
	ReusableMethods reuse= new ReusableMethods();
	
	Homepageobjects hpb=new Homepageobjects(driver);
	
	hpb.myaccountlink.click();
	
	logobj.emailidtxt.sendKeys("selenium_testing@gmail.com");
	
	logobj.pwdtxt.sendKeys("guru99@123");
	
	logobj.loginbtn.click();
	
	Thread.sleep(1000);
	
	logobj.mywishlistbtn.click();
	
	logobj.addtocartbtn.click();
	
	logobj.proceedtocheckoutbtn.click();
	
	bilobj.addresstxtbox.sendKeys("saroornagar");
	
	bilobj.citytxtbox.sendKeys("hyderabad");
	
	reuse.dropdown(bilobj.countrydropdown,Dropdownoptions.visibleText, "India");
	
	bilobj.statedropdown.sendKeys("telangana");
	
	bilobj.zipcode.sendKeys("500035");
	
	bilobj.telephonetxtbox.sendKeys("1234567890");
	
	bilobj.shiptothisaddradiobtn.click();
	
	bilobj.billinginfo_continuebtn.click();
	
	bilobj.shipngmethod_continuebtn.click();
	
	bilobj.chkmoneyorder_radiobtn.click();
	
	bilobj.pymntcontinuebtn.click();
	
	bilobj.orderreview_placeorderbtn.click();
	
	System.out.println(bilobj.ordrmsg.getText());
	
	System.out.println(bilobj.ordernum);
	
	driver.close();

	
	}

}
