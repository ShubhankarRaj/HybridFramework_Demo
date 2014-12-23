package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.BuyPage_Action;
import pageObjects.BaseClass;
import pageObjects.BuyPage;
import utility.Log;
import utility.Utils;

public class BuyPositiveTC1 {
	public WebDriver driver;
	@BeforeMethod
	public void beforeMethod() throws Exception{
		Log.info("In Before method.");
		Log.info("Executing first test - BuyPositiveTC1");
		driver = Utils.OpenBrowser(1);
		new BaseClass(driver);	
	}
	@Test
	public void mainTest() throws InterruptedException{
		BuyPage_Action.execute();
		
	}
	

}
