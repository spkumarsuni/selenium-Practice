package com.virtusa.guru99.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.virtusa.guru99.PageObjects.Homepageobjects;

public class Mobileaddtocomparetest extends Browsersetup{

	public static WebDriver driver;
	
	
	@BeforeTest
	public void Browserlaunch() 
	{
		Browserselection("firefox","http://live.guru99.com");
	}
	
	@Test
	public void Addtocomparetest() throws Exception 
	{
		Homepageobjects hpb=new Homepageobjects(driver);
		
		hpb.mobilemenuoptionclick();
		
		hpb.addtocomparesony.click();
		
		hpb.addtocompareiphone.click();
		
		hpb.comparebtn.click();
		
		String windowhandler_parent=driver.getWindowHandle();
		
		System.out.println(windowhandler_parent);
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> it=s1.iterator();
		
		while(it.hasNext())
		{
			String child_window=it.next();
			
			if(!windowhandler_parent.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				
				System.out.println("Sony Xperia is shown in popup" +hpb.sonyxperiatext_popupwindow.getText());
				
				System.out.println("iphone is shown in popup"   +hpb.iphonetext_popupwindow.getText());
				
				Thread.sleep(1000);
				
				driver.close();
			}
			
		}
		
		driver.switchTo().window(windowhandler_parent);
		
		System.out.println(hpb.pagetitle());
		
		driver.close();
	
		
	}
}
