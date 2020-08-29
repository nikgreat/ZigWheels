package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarsUnder4LacPage extends PageValidation{
	
	static WebDriver driver;
	public CarsUnder4LacPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static String getTitleOfPage() {
		return driver.getTitle();
	}
	
	public static void ext() {
		pgvalid();
		System.out.println("--This is the last page!!!!! ");
	}
	
	public static void ClickMore() {
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[1]/div/div/span")).click();
	   driver.findElement(By.cssSelector("#carModels > ul > li.txt-c.moreModels.mb-20 > span")).click();
	}
	

	

}
