package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utility.Log;

public class BuyPage extends BaseClass {
	//public static WebDriver driver = null;
	private static WebElement element;
//	public static String sLocation;
	public static String sSearchCount;
	 public BuyPage(WebDriver driver){		 
		 super(driver);
	 }
	 public static WebElement txt_Buy_Location() throws InterruptedException{
		 element = null;
		 Log.info("Entering value to location for buy");
		 Thread.sleep(5000);
		 WebElement element =  driver.findElement(By.id("Location"));	
		 return element;
//		 elem.click();	
//		 //Location
//		 WebElement loc = driver.findElement(By.id("Location"));
//		 loc.clear();
//		 loc.sendKeys("Las Vegas, NV");
//		 WebElement elemtwo = driver.findElement(By.className("i-magnifier-extra-large"));
//		 elemtwo.click();
	}
	public static WebElement txt_Buy_FromAmount() throws InterruptedException{
		 element = null;
		 WebElement element =  driver.findElement(By.id("MinimumPrice"));		 
		 //WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
	}		
	public static WebElement txt_Buy_ToAmount() throws InterruptedException{
		 element = null;
		 WebElement element =  driver.findElement(By.id("MaximumPrice"));		 
		 //WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
	}
	public static void list_Buy_Beds(String strBed) throws InterruptedException{
		Select selement = new Select(driver.findElement(By.id("MinimumBed")));
		selement.selectByVisibleText(strBed);
	}
	public static void list_Buy_Baths(String strbath) throws InterruptedException{

		Select selement = new Select(driver.findElement(By.id("MinimumBath")));   	
   		selement.selectByVisibleText(strbath);	 
		
	}	
	public static WebElement btn_Buy_Search() throws InterruptedException{
		 element = null;
		 WebElement element =  driver.findElement(By.className("i-magnifier-extra-large"));		 
		 //WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
	}
	public static WebElement txt_Buy_SamePageSearchResult() throws InterruptedException{
		 element = null;
		 WebElement element =  driver.findElement(By.className("highlight evtPropCount"));		 
		 //WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
	}	
	public static WebElement txt_Buy_NextPageSearchResult() throws InterruptedException{
		 element = null;
		 WebElement element =  driver.findElement(By.className("property-title"));		 
		 //WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
	}
	public static WebElement btn_Buy_DialogContinueButton() throws InterruptedException{
		 element = null;
		 WebElement element =  driver.findElement(By.className("i-magnifier-extra-large"));		 
		 //WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
	}
	
}
