package com.virtusa.guru99.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsersetup {
	
	public static WebDriver driver;
	
	/*public void setup(String Browsername)
	{
		switch(Browsername)
		case "firefox":
			
	}*/
	
	public void Browserselection(String Browser,String appurl)
	{
		if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get(appurl);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}else if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "");
			
			driver = new ChromeDriver();
			
		}else if(Browser.equalsIgnoreCase("�nternet explorer"))
		{
			System.setProperty("webdriver.ie.driver", "");
			
			driver = new InternetExplorerDriver();
		} else
		{
			System.out.println("No browser launched");
            
			
		}
		
	
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void Browserclosing()
	{
		driver.close();
	}

}
