package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class MortgageCalculator extends BaseClass{
	private static WebElement HomeLocation = null;
	private static WebElement HomePrice = null;
	private static WebElement DownPayment= null;
	private static WebElement InterestRate= null;

	public MortgageCalculator(WebDriver driver)
	{
		super(driver);
	}
	public static WebElement EnterHomeLocation()
	{
		try{
			HomeLocation = driver.findElement(By.id("mort-location"));
			Log.info("HomeLocation text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("HomeLocation text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return HomeLocation;
		//	HomeLocation.clear();
		//	HomeLocation.sendKeys("Ben Claire, SD");
	}
	public static WebElement EnterHomePrice()
	{
		try{
		HomePrice = driver.findElement(By.id("mort-home-price"));
		Log.info("HomePrice text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("HomePrice text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return HomePrice;
		//	HomePrice.clear();
		//	HomePrice.sendKeys("60000");
	}
	public static WebElement EnterDownPayment()
	{
		try{
		DownPayment = driver.findElement(By.id("mort-downpay-dollar"));
		Log.info("Downpayment text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("Downpayment text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return DownPayment;
		//		DownPayment.clear();
		//		DownPayment.sendKeys("10000");
	}
	public static WebElement EnterInterestRate()
	{
		try{
			InterestRate = driver.findElement(By.id("mort-interest"));
			Log.info("InterestRate text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("InterestRate text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return InterestRate;
		//		InterestRate.clear();
		//		InterestRate.sendKeys("12");
	}
}

