package com.virtusa.guru99.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.virtusa.guru99.PageObjects.Homepageobjects;
import com.virtusa.guru99.PageObjects.Registration_objects;
import com.virtusa.guru99.PageObjects.tvpageobjects;
import com.virtusa.guru99.utils.Constants;
import com.virtusa.guru99.utils.ExcelReader;
import com.virtusa.guru99.utils.TestRepository;

public class Registration_test extends Browsersetup{
	
	public static WebDriver driver;
	public static String fileName;
	public static String sheetName;
	public static ExcelReader excel;
	Homepageobjects hpb;
	Registration_objects regobj;
	tvpageobjects tvobj;
	
	
	@BeforeTest
	public void Browserlaunch()
	{
//		Browserselection("firefox", "http://live.guru99.com");
		fileName="/Users/nandakishoreannavajjala/Documents/sample test data/testdata1.xlsx";
		sheetName = "sheet1";
		excel = new ExcelReader();
//		hpb=new Homepageobjects();
//		
//		regobj=new Registration_objects(driver);
//		
//		tvobj=new tvpageobjects(driver);
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] testData(String fileName,String sheetName) throws Exception
	{
		
		List<TestRepository> ListRepo = excel.readDataFromExcel(fileName, sheetName);
		
		Object[][] test = new Object[ListRepo.size()][];
		for (int i = 0; i<ListRepo.size(); i++)
		{
			test[i] = new Object[1];
			test[i][0] = ListRepo.get(i);
		}		
		return test;
	}

	@Test(dataProvider="testdata")
	public void register_test(TestRepository completeRowData) throws Exception
	{
		
//		List<TestRepository> ListRepo = excel.readDataFromExcel(fileName, sheetName);
//		
//		for (TestRepository completeRowData:ListRepo) {
//			System.out.println(ListRepo.get(0).);
//		
		System.out.println("Row:" + completeRowData.getRowNum()+ "- ");
		System.out.println(completeRowData.getRowData());
//		hpb.myaccountlink.click();
//		
//		regobj.createanaccountbtn.click();
//		
//		regobj.firstnametxtbox.sendKeys(completeRowData.getRowData().get(Constants.firstName));
//		regobj.lastnametxtbox.sendKeys(completeRowData.getRowData().get(Constants.lastName));
		
		}
			
			
		
		
		/*
		hpb.myaccountlink.click();
		
		regobj.createanaccountbtn.click();
		
		regobj.firstnametxtbox.sendKeys("testing");
		
		regobj.middlenametxtbox.sendKeys("guru99");
		
		regobj.lastnametxtbox.sendKeys("seleniumproject");
		
		regobj.emailidtxtbox.sendKeys("selenium_testing@gmail.com");
		
		regobj.pwdtxtbox.sendKeys("guru99@123");
		
		regobj.cfnpwdtxtbox.sendKeys("guru99@123");
		
		regobj.registerbtn.click();
		
		Thread.sleep(1000);
		
		regobj.tvoption.click();
		
		tvobj.addtowishbtnlg.click();
		
		tvobj.sharewishlistbtn.click();	
		
		tvobj.emailidtxt.sendKeys("selenium@gmail.com");
		
		tvobj.messagetxtbox.sendKeys("testing selenium code");
		
		tvobj.sharewishlist_btn.click();
		
		System.out.println(tvobj.sharemsgtxt.getText());
		
		
		
		driver.close();*/
		
	}

