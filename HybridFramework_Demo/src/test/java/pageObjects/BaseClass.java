package pageObjects;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public BaseClass(WebDriver driver){
		this.driver = driver;
		this.bResult = true;
	}
}
