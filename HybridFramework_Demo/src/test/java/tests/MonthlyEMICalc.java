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
			System.out.println("The Text is displayed");
		}
		Assert.assertEquals(true, pageTitle.isDisplayed());
		
		
		driver.close();
		

	}

}
