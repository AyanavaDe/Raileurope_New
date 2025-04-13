package Trezy_Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_DDT_write 
{
public static void write(int row, int cell, String ref)
{
	Workbook book;
	FileInputStream fis;
	String path ="./excel/Trezy_NR.xlsx";
	{
		try 
		{
		     fis = new FileInputStream(path);
	         book = WorkbookFactory.create(fis);
		     Sheet sh = book.getSheet("TestCases");                                             //when to print in the same tab
		     Cell r2 = sh.getRow(row).getCell(cell);
	         r2.setCellValue(ref);
		                                                                                        //Write changes to the Excel file
             FileOutputStream fos = new FileOutputStream(path);
             book.write(fos);		         
		} 
		
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	
	}
}
}