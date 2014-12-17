package testCases;
import java.io.File;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetSelectOptions;

import utility.ExcelUtils;


public class MonthlyEMICalc {
//	public static void main(String[] args) {
//		
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("http://www.realtor.com/home-finance/financial-calculators/mortgage-payment-calculator.aspx?source=web");
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement pageTitle = driver.findElement(By.xpath("//*[@id='mort-location']"));
//		if(pageTitle.isDisplayed()){
//			System.out.println("The Text is displayed");
//		}
//		Assert.assertEquals(true, pageTitle.isDisplayed());
//		System.out.println("I have pushed the code to GITHUB");
//		System.out.println("Lets see if it gets pulled");
//		
//		System.out.println("Demonstrating the commit");
//		System.out.println("testing commit");
//		System.out.println("Swapnil - testing commit");
//		driver.close();		
//		System.out.println("This is the seventh COMMIT");
//		System.out.println("Now this is Eigth Commit");
//		System.out.println("Swapnil - This is tenth commit");
//		
//		System.out.println("This is going to be the ninth COMMIT");
//		System.out.println("Ratnesh commented");
//	}
	@Test
	public void testapp() throws Exception{
		ExcelUtils eu = new ExcelUtils();
		eu.getfile(1, 2, "Sheet1");	
	}
}
