package utility;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utils {
	public static WebDriver driver = null;
	public static WebDriver OpenBrowser(int iTestCaseRow){
		String sBrowserName;
		sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
		switch(sBrwosername){
		case mozilla:
			driver = new FirefoxDriver();
			Log.info("New Firefox driver initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully");
		case iExplorer:
			driver = new InternetExplorerDriver();
			Log.info("New Firefox driver initiated");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 20 seconds");
			driver.get(Constant.URL);
			Log.info("Web Application launched successfully");

		}
		{
			return driver;

		}
	}
}
