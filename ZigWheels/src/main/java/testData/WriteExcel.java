package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;

import pages.CarsUnder4LacPage;

public class WriteExcel {
	
	static WebDriver driver;
	static HSSFWorkbook workbook; 
	static HSSFSheet sheet;
	static HSSFCell cell;
	
	public WriteExcel(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void write() throws IOException {
		
		String currentDirectory = System.getProperty("user.dir");
		File src= new File(currentDirectory+"\\Excel\\GetTitle.xls");
		
		FileInputStream finput = new FileInputStream(src);
		
		workbook = new HSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);
		
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		
		String title = CarsUnder4LacPage.getTitleOfPage();
		
		cell.setCellValue(title);
		
		FileOutputStream fout = new FileOutputStream(src);
		workbook.write(fout);
		fout.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
		

	}

}
