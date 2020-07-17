package appModules;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import pageObjects.BuyPage;
import utility.Constant;
import utility.ExcelUtils;
public class BuyPage_Action {
		public static void execute() throws Exception{	
			///sdfsdfafasdfdssssssssssssssssssssssrrwqewerwqeqwerweq
			///sdfsdfafasdfdsssssssssssssssssssssss
			String HomeLocation = ExcelUtils.getCellData(1, Constant.Col_Buy_Location, "Sheet1");
			//BuyPage.sLocation = BuyPage.txt_Buy_Location().getText();
			//String owserName;
		//	owserName = ExcelUtils.getCellData(1, 14, "Sheet1");
		//	System.out.println(owserName);
			System.out.println(HomeLocation);
			BuyPage.txt_Buy_Location().clear();
			BuyPage.txt_Buy_Location().sendKeys("Las Vegas, LV");
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
			System.out.println("Actual is "+actual);
			Assert.assertEquals("5,508", actual);
		}
		public static void mmain() throws  IOException {
			
			//rc.get("https://reqres.in/api/users");
		List<String> list = new ArrayList<String>();
		list.add("Amar");
		list.add("Akbar");
		list.add("Amar");
		
		System.out.println(list);	
		Set<String> set = new HashSet<String>();
		set.add("Amar");
		set.add("Akbar");
		set.add("Amar");
		System.out.println(set);
		
		}
}