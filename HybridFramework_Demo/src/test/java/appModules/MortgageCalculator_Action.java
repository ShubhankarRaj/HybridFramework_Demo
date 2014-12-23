package appModules;

import org.testng.Reporter;
//import pageObjects.Home_Page;
import pageObjects.MortgageCalculator;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;


public class MortgageCalculator_Action {
	public static void Execute(int iTestCaseRow) throws Exception{

//		 Clicking on the My Account link on the Home Page
//		 Home_Page.lnk_MyAccount().click();
//		 Log.info("Click action is performed on My Account link" );

		String HomeLocation = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_HomeLocation, "Sheet1");
		MortgageCalculator.EnterHomeLocation().clear();
		MortgageCalculator.EnterHomeLocation().sendKeys(HomeLocation);
		Log.info(HomeLocation+" is entered in Location text box" );
		
		String HomePrice = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_HomePrice, "Sheet1");
		MortgageCalculator.EnterHomePrice().clear();
		MortgageCalculator.EnterHomePrice().sendKeys(HomePrice);
		Log.info(HomePrice+" is entered in Home Price text box" );	

		String DownPayment = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DownPayment, "Sheet1");
		MortgageCalculator.EnterDownPayment().clear();
		MortgageCalculator.EnterDownPayment().sendKeys(DownPayment);
		Log.info(DownPayment+" is entered in DownPayment text box" );
		
		String InterestRate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MortgageIntRate, "Sheet1");
		MortgageCalculator.EnterInterestRate().clear();
		MortgageCalculator.EnterInterestRate().sendKeys(InterestRate);
		Log.info(InterestRate+" is entered in InterestRate text box" );	
		
//		Utils.waitForElement(Home_Page.lnk_LogOut());
//		Reporter.log("SignIn Action is successfully performed");

	}
}
