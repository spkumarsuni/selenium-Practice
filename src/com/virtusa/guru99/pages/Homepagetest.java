package com.virtusa.guru99.pages;

import org.testng.annotations.*;

import com.virtusa.guru99.PageObjects.Homepageobjects;
import com.virtusa.guru99.utils.ReusableMethods;

public class Homepagetest extends Browsersetup{
	
	@BeforeTest
	public void Browserlaunch()
	{
		Browserselection("firefox","http://live.guru99.com");	
	}
	
	@Test
	public void Hometest()
	{
		Homepageobjects hpb=new Homepageobjects();
		
		ReusableMethods reuse= new ReusableMethods();
		
		System.out.println(hpb.pagetitle());
		
		hpb.mobilemenuoptionclick();
		
		reuse.dropdown(hpb.dropdownmenuoption,Dropdownoptions.visibleText, "Name");
	}
	
	@AfterTest
	public void Browserclosing()
	{
		driver.close();
	}
}
