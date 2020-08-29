package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequiredBikes {
	
	public static WebDriver driver;

	public RequiredBikes(WebDriver driver)
	{
		this.driver = driver;
	}
	public static void BikeList() throws IOException
	{
		String price="";
		int cost =0;
		String costPrice="";
		String out="";
		String s="";
		String temp="";
		int r=0;
		int c=0;
		
		Row row;
		Cell cell;
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Excel\\ExcelOutput.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet=wb.getSheetAt(0);
        row = sheet.createRow(r);
        cell = row.createCell(c);
        cell.setCellValue("Title Of Bike");
        cell = row.createCell(c+1);
        c+=1;
        cell.setCellValue("Expected Launch");
        cell = row.createCell(c+1);
        c+=1;
        cell.setCellValue("Price ");
        r+=1;
        c=0;
        
        
        
		
		
		
        WebElement list = driver.findElement(By.cssSelector("ul[class='mk-row srp_main_div clr']"));
		int count =list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']")).size();
		int hiddenCount = list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']")).size();
		
		
	
		for(int i=0;i<count;i++)
		{
			 s = (list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(2)")).get(i)).getText();
			if(s.contains("L"))
			{
				price = s.substring((s.indexOf("s") + 3), (s.indexOf("L")-1));
				costPrice = price.substring(0,price.indexOf("."));
				cost = Integer.parseInt(costPrice);
				if(cost < 4)
				{
					out = (list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(2)")).get(i)).getAttribute("title");
					row = sheet.createRow(r);
			        cell = row.createCell(c);
					cell.setCellValue(out.substring(0, out.indexOf("E")-1));
					cell = row.createCell(c+1);
					c+=1;
					temp=(list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(3)")).get(i)).getText();
					cell.setCellValue(temp.substring((temp.indexOf(":")+1)));
					cell = row.createCell(c+1);
					c+=1;
					cell.setCellValue((list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(2)")).get(i)).getText());
					r+=1;
					c=0;
				
					
				}
			}
			else
			{
				price = s.substring(s.indexOf("s") + 3);
				price = price.replace(",", "");
				cost = Integer.parseInt(price);
				if(cost < 400000)
				{
					out = (list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(2)")).get(i)).getAttribute("title");
					row = sheet.createRow(r);
			        cell = row.createCell(c);
					cell.setCellValue(out.substring(0, out.indexOf("E")-1));
					cell = row.createCell(c+1);
					c+=1;
					temp=(list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(3)")).get(i)).getText();
					cell.setCellValue(temp.substring((temp.indexOf(":")+1)));
					cell = row.createCell(c+1);
					c+=1;
					cell.setCellValue((list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem ']  div:nth-child(2)")).get(i)).getText());
					r+=1;
					c=0;
				}
			}
			
			
				
				
		}
		for(int j=0;j<hiddenCount;j++)
		{
			s = (list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels'] div:nth-child(2)")).get(j)).getText();
			price = s.substring((s.indexOf("s") + 3),(s.indexOf("L")-1));
			if((s.contains("L")) && (price.length() < 2) )
			{
				
					
					cost = Integer.parseInt(price);
					if(cost < 4)
					{
						out = (list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']  div:nth-child(2)")).get(j)).getAttribute("title");
						row = sheet.createRow(r);
				        cell = row.createCell(c);
						cell.setCellValue(out.substring(0, out.indexOf("E")-1));
						cell = row.createCell(c+1);
						c+=1;
						temp=(list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']  div:nth-child(3)")).get(j)).getText();
						cell.setCellValue(temp.substring((temp.indexOf(":")+1)));
						cell = row.createCell(c+1);
						c+=1;
						cell.setCellValue((list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']  div:nth-child(2)")).get(j)).getText());
						r+=1;
						c=0;
					}
				
			}
			else if(s.contains("L"))
			{
				
				costPrice = price.substring(0,price.indexOf("."));
				cost = Integer.parseInt(costPrice);
				if(cost < 4)
				{
					out = (list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']  div:nth-child(2)")).get(j)).getAttribute("title");
					row = sheet.createRow(r);
			        cell = row.createCell(c);
					cell.setCellValue(out.substring(0, out.indexOf("E")-1));
					cell = row.createCell(c+1);
					c+=1;
					temp=(list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']  div:nth-child(3)")).get(j)).getText();
					cell.setCellValue(temp.substring((temp.indexOf(":")+1)));
					cell = row.createCell(c+1);
					c+=1;
					cell.setCellValue((list.findElements(By.cssSelector("li[class ='col-lg-4 txt-c rel modelItem  hiddenModels']  div:nth-child(2)")).get(j)).getText());
					r+=1;
					c=0;		
				}
			}
			
			
			
			
				
				
		}
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\Excel\\ExcelOutput.xls");
		wb.write(fo);
		wb.close();
		fo.close();
	}
}

