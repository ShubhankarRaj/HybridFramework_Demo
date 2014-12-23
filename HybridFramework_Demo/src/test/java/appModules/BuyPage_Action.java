package appModules;

import org.testng.Assert;

import pageObjects.BuyPage;
import pageObjects.BaseClass;

public class BuyPage_Action {

		public static void execute() throws InterruptedException{
			
			//BuyPage.sLocation = BuyPage.txt_Buy_Location().getText();
			BuyPage.txt_Buy_Location().clear();
			BuyPage.txt_Buy_Location().sendKeys("Las Vegas, NV");
			BuyPage.txt_Buy_FromAmount().clear();
			BuyPage.txt_Buy_FromAmount().sendKeys("200");
			BuyPage.txt_Buy_ToAmount().clear();
			BuyPage.txt_Buy_ToAmount().sendKeys("200000");
			BuyPage.list_Buy_Beds("2+ Beds");
			BuyPage.list_Buy_Baths("2+ Baths");
			BuyPage.btn_Buy_Search().click();
			BuyPage.sSearchCount = BuyPage.txt_Buy_NextPageSearchResult().getText();
			String[] strActual = BuyPage.sSearchCount.split("properties found");
			String actual = strActual[0].trim();
			Thread.sleep(5000);
			Assert.assertEquals("5,748", actual);			
		}
}
