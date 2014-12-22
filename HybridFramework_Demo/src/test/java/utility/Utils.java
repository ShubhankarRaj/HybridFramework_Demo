package utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public static WebDriver driver = null;
	public static WebDriver OpenBrowser(int iTestCaseRow){
		String sBrowserName;
		sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
		switch(sBrowserName)
		{
		default:

			driver = new FirefoxDriver();
			Log.info("New Firefox driver initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully");
			break;

		case "mozilla":
			driver = new FirefoxDriver();
			Log.info("New Firefox driver initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully");
			break;
		
		case "iExplorer":
			driver = new InternetExplorerDriver();
			Log.info("New Internet Explorer initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully");
			break;
		
		case "chrome":
			driver = new ChromeDriver();
			Log.info("New Chrome driver initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the Chrome Driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully in CHROME.");
			break;
			
		case "safari":
			driver = new SafariDriver();
			Log.info("New Chrome driver initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the Safari Driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully in SAFARI.");
			break;
		
		}

		{
			return driver;

		}	
	}
	public static String getTestCaseName(String sTestCase){
		String value = sTestCase;

		int posi = value.indexOf("@");
		value = value.substring(0, posi);
		posi = value.lastIndexOf(".");
		value = value.substring(posi+1);
		return value;
	}

	public static void mouseHoverAction(WebElement mainElement, String subElement){
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		if(subElement.equals("All Homes")){

		}
		if(subElement.equals("Appartments For Rent")){

		}
		if(subElement.equals("Mortgage Rates")){

		}
		if(subElement.equals("Rent or Buy?")){

		}
		action.click();
		action.perform();
		Log.info("Click Action is performed on the sub category");
	}

	public static void waitForElement(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void takeScreenshot(WebDriver driver, String stestCaseName) throws Exception{
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + stestCaseName + ".jpg"));
		}catch(Exception e){
			Log.info("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			throw new Exception();
		}
	}
}
