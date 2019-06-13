package org.data.DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {

	public static void main(String[] args) throws Throwable {
		 
		{
			File excelLoc=new File("C:\\Users\\Greens-14\\eclipse-workspace\\DataDriven\\excel\\Data.xlsx");
			
			FileInputStream f=new FileInputStream(excelLoc);
			Workbook w=new XSSFWorkbook(f);
			
			Sheet shname=w.getSheet("Sheet1");
			Row row=shname.getRow(1);
			Cell cellname=row.getCell(0);
			Cell cellpassword=row.getCell(1);
			System.out.println(cellname);
			System.out.println(cellpassword);
			System.out.println("Row Count:"+shname.getPhysicalNumberOfRows());
			
			
			
			
			
			
			
			
		}

	}

}
