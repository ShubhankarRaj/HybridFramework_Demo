package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
  private	static XSSFRow shtrow=null;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static XSSFSheet sht = null;
	
	public static String getCellData(int RowNum, int ColNum, String shtName) throws Exception{
		ExcelUtils.getfile(RowNum, ColNum, shtName);
		Cell = sht.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		Log.info("Excel Sheet opened!!");
		return CellData;
	}	
//	private static XSSFSheet ExcelWSheet;
//	private static XSSFWorkbook ExcelWBook;
//	private static XSSFCell Cell;
//	private static XSSFRow Row;
//	
//	public static String getCellData(int RowNum, int ColNum){
//		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
//		String CellData = Cell.getStringCellValue();
//		Log.info("Excel Sheet opened!!");
//		return CellData;
//	}
//	
//	public void getfile(int row, int col, String shtName) throws Exception{
//
//		String file = ClassLoader.getSystemResource("testData/"+Constant.File_TestData).getFile();
//		File fil = new File(file);
//		FileInputStream fis = new FileInputStream(fil); 
//		XSSFWorkbook hwb = new XSSFWorkbook(fis);
//		XSSFSheet sht =  hwb.getSheet(shtName);
//		XSSFCell cell =  sht.getRow(row).getCell(col);
//		System.out.println(cell.toString());	
//		// need to add few more line for catch.
//	}
	public static void getfile(int row, int col, String shtName) throws Exception{
		String file=null;
		FileInputStream fis = null;
		XSSFCell cell = null;
		
		try {
			file = ClassLoader.getSystemResource("testData/"+Constant.File_TestData).getFile();
			File fil = new File(file);
			fis = new FileInputStream(fil); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		try {
			XSSFWorkbook hwb = new XSSFWorkbook(fis);
			sht = hwb.getSheet(shtName);
			shtrow = sht.getRow(row);
			cell =  sht.getRow(row).getCell(col);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println(cell.toString());	
		// need to add few more line for catch.
	}
	public static int getRowUsed() throws Exception {
		try{			
			int RowCount = shtrow.getLastCellNum();
			Log.info("Total number of Row used return as < " + RowCount + " >.");		
			return RowCount;
		}catch (Exception e){
			Log.error("Class ExcelUtil | Method getRowUsed | Exception desc : "+e.getMessage());
			System.out.println(e.getMessage());
			throw (e);
		}

	}
}
