package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("hello world");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		driver.quit();
		
	}
	


}
