package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import appModules.MortgageCalculator_Action;

public class MortgageTest {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		sTestCaseName = Utils.getTestCaseName(this.toString());
		sTestCaseName = this.toString();
		Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		driver = Utils.OpenBrowser(iTestCaseRow);
		new BaseClass(driver)
	}

	@Test
	public void RunMortgageCalculatorTest()
	{

		MortgageCalculator_Action.Execute(iTestCaseRow);
	}

	//  @Test
	//  public void main() throws Exception {
	//	  try{
	//		
	//		SignIn_Action.Execute(iTestCaseRow);
	//		ProductSelect_Action.productType(iTestCaseRow);
	//		ProductSelect_Action.productNumber(iTestCaseRow);
	//		CheckOut_Action.Execute();
	//		PaymentDetails_Action.execute(iTestCaseRow);
	//		Confirmation_Action.Execute();
	// 		Verification_Action.Execute();
	//		if(BaseClass.bResult==true){
	//			// If the value of boolean variable is True, then your test is complete pass and do this
	//			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
	//		}else{
	//			// If the value of boolean variable is False, then your test is fail, and you like to report it accordingly
	//			// This is to throw exception in case of fail test, this exception will be caught by catch block below
	//			throw new Exception("Test Case Failed because of Verification");
	//		}
	//		
	//	 
	//	  }catch (Exception e){
	//		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
	//		  Utils.takeScreenshot(driver, sTestCaseName);
	//		  Log.error(e.getMessage());
	//		  throw (e);
	//	  }
	//		
	//  }
	//  @AfterMethod
	//  public void afterMethod() {
	//	    // Printing beautiful logs to end the test case
	//	    Log.endTestCase(sTestCaseName);
	//	    // Closing the opened driver
	//	    driver.close();
	//  		}
	//
	//}


}
