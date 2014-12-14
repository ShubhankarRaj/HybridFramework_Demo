package tests;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MonthlyEMICalc {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.realtor.com/home-finance/financial-calculators/mortgage-payment-calculator.aspx?source=web");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement pageTitle = driver.findElement(By.xpath("//*[@id='mort-location']"));
		if(pageTitle.isDisplayed()){
			System.out.println("The Text is displayed");		}
		Assert.assertEquals(true, pageTitle.isDisplayed());
		System.out.println("I have pushed the code to GITHUB");
		System.out.println("Lets see if it gets pulled");		
		System.out.println("Demonstrating the commit");
		System.out.println("testing commit");
		System.out.println("final fetch");
		driver.close();	
		}

}
