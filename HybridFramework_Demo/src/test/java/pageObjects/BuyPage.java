package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class BuyPage extends BaseClass {
	//public static WebDriver driver = null;
	private static WebElement element;
	 public BuyPage(WebDriver driver){		 
		 super(driver);
	 }
	 public WebElement txt_Buy_Location() throws InterruptedException{

		 Thread.sleep(10000);
		// Assert.assertEquals(3, 3);
		// Thread.sleep(1000);
		 WebElement contclick =  driver.findElement(By.id("aContinueRealtor"));		 
		 contclick.click();
		 Thread.sleep(2000);
		 WebElement element =  driver.findElement(By.cssSelector(".nav-main-navitems > li:nth-child(1) > a:nth-child(1)"));
		 return element;
//		 elem.click();
//		
//		 //Location
//		 WebElement loc = driver.findElement(By.id("Location"));
//		 loc.clear();
//		 loc.sendKeys("Las Vegas, NV");
//		 WebElement elemtwo = driver.findElement(By.className("i-magnifier-extra-large"));
//		 elemtwo.click();
	}
	public WebElement txt_Buy_FromAmount(){
		
		return element;
	}
		
}
