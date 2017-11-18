package com.virtusa.guru99.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.virtusa.guru99.pages.Dropdownoptions;

public class ReusableMethods {
	
	WebDriver driver;
	
	public Select dropoption;
	
	TakesScreenshot ts;
	
	public void dropdown(WebElement element,Dropdownoptions selectByOption,String selection)
	{
		dropoption= new Select(element);
		
		switch(selectByOption)
		{
		case visibleText: 
			dropoption.selectByVisibleText(selection);
		case index:
			dropoption.selectByIndex(Integer.parseInt(selection));
		case value:
			dropoption.selectByValue(selection);
		}
		
		
	}
	
	public void capturescreenshot() throws Exception
	{
		ts = (TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFileToDirectory(src, new File("//.screenshots/"+System.currentTimeMillis()+".jpeg"));
	}

}
