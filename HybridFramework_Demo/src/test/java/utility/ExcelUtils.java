package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static String getCellData(int RowNum, int ColNum){
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		Log.info("Excel Sheet opened!!");
		return CellData;
	}
	
	public void getfile(int row, int col, String shtName) throws Exception{

		String file = ClassLoader.getSystemResource("testData/"+Constant.File_TestData).getFile();
		File fil = new File(file);
		FileInputStream fis = new FileInputStream(fil); 
		XSSFWorkbook hwb = new XSSFWorkbook(fis);
		XSSFSheet sht =  hwb.getSheet(shtName);
		XSSFCell cell =  sht.getRow(row).getCell(col);
		System.out.println(cell.toString());	
		// need to add few more line for catch.
	}
}
