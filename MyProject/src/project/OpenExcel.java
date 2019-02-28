package project;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpenExcel  {
	 File file;
	 FileInputStream src;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public static String OpeningExcel(int sheetnum,int row,int col)throws Exception{
File file=new File("F://MyfirstProject//MyProject//TestData.xlsx");
	FileInputStream src= new FileInputStream(file);
	 
	XSSFWorkbook workbook=new XSSFWorkbook(src);
	 
 XSSFSheet sheet=workbook.getSheetAt(sheetnum);
 
String data=sheet.getRow(row).getCell(col).getStringCellValue();
System.out.println("Expected link from Excel is :>>> "+data);
return data;
	}
}

 






