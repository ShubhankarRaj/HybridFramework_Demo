package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class MortgageBuyorRent extends BaseClass{
	private static WebElement element = null;
	
	public MortgageBuyorRent(WebDriver driver){
		super(driver);
		
	}
	//This is just TEST line.
	public static WebElement txtbx_Location() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='location']"));
			Log.info("Location text box is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Location text box is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_DesiredHomePrice() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='homeprice']"));
			Log.info("Desired Home Price text box is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Desired Home Price text box is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement txtbx_DesiredMonthlyRent() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='monthlyrent']"));
			Log.info("Desired Monthly Rent text box is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Desired Monthly Rent text box is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_Calculate() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='btnCalculate']"));
			Log.info("Calculate button is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Calculate button is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lbl_onlyYear() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='viewOnlyYearLabel']"));
			Log.info("Only year label/link is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Only year label/link is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement img_Canvas() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='placeholder']/canvas[2]"));
			Log.info("Buy-Rent Comparison graph is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Buy-Rent comparison graph is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lbl_BuyingYearlyStats() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='yearlyStats']/div[1]/h4"));
			Log.info("Buying Yearly Stats label is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Buying Yearly Stats label is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lbl_RentingYearlyStats() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='yearlyStats']/div[2]/h4"));
			Log.info("Renting Yearly Stats label is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Renting Yearly Stats label is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lbl_BuyYearTotal() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='ThisYearTotal']"));
			Log.info("Total Expense on Buying label is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Total Expense on Buying label is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement lbl_RentYearTotal() throws Exception{
		try{
			element = driver.findElement(By.xpath(".//*[@id='ThisYearTotal_rent']"));
			Log.info("Total Expense on Renting label is found on the \"Mortgage Buy or Rent\" Page");
		}catch (Exception e){
			Log.error("Total Expense on Renting label is not found on the \"Mortgage Buy or Rent\" Page");
			throw(e);
		}
		return element;
	}
}
