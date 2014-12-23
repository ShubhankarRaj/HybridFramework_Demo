package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class MortgageCalculator extends BaseClass{
	private static WebElement element = null;

	public MortgageCalculator(WebDriver driver)
	{
		super(driver);
	}
	public static WebElement EnterHomeLocation()
	{
		try{
			element = driver.findElement(By.id("mort-location"));
			Log.info("HomeLocation text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("HomeLocation text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return element;
	}
	public static WebElement EnterHomePrice()
	{
		try{
			element = driver.findElement(By.id("mort-home-price"));
			Log.info("HomePrice text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("HomePrice text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return element;
	}
	public static WebElement EnterDownPayment()
	{
		try{
			element = driver.findElement(By.id("mort-downpay-dollar"));
			Log.info("Downpayment text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("Downpayment text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return element;
	}
	public static WebElement EnterInterestRate()
	{
		try{
			element = driver.findElement(By.id("mort-interest"));
			Log.info("InterestRate text box is found on the Mortgage Calculator Page");
		}
		catch(Exception e){
			Log.error("InterestRate text box is not found on the Mortgage Calculator Page");
			throw(e);
		}
		return element;
	}
}

