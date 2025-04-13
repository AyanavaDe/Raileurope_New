package Trezy_Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

  public class Generic_DDT_fetch 
  {
  static String value="";
  static String value1="";
  static String path ="C:\\Users\\deanu\\git\\repository\\Automation\\Excel\\Trezy_NR.xlsx";
  public static String Origin_Fetch(String sheet, int row, int cell1)
  {
	try 
	{
		FileInputStream fis = new FileInputStream(path);
	     Workbook book = WorkbookFactory.create(fis);
	     Sheet sh = book.getSheet(sheet); 
	     Row r1 = sh.getRow(row);            
	     Cell origin = r1.getCell(cell1);  
	     value=origin.toString();       
	 } 
	
	catch (Exception e) 
	{
		 e.printStackTrace();
	 }
	return value;
   }

public static String Destination_Fetch(String sheet, int row, int cell2)
{
	try 
	{
		FileInputStream fis = new FileInputStream(path);
	     Workbook book = WorkbookFactory.create(fis);
	     Sheet sh = book.getSheet(sheet); 
	         Row r1 = sh.getRow(row);            
	        Cell destination = r1.getCell(cell2);  
	        value1=destination.toString();
	} 
	
	catch (Exception e) 
	{
		 e.printStackTrace();
	}
	return value1;	
}

}
