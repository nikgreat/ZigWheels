package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.escape.Escapers.Builder;

import library.Repository;

public class NewCarsPage extends PageValidation {
	
	static WebDriver driver;
	public NewCarsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void NewCars() throws IOException, InterruptedException {
		
		
		By NewCarsLink = Repository.o2();
		
		// pgvalid();
		// driver.get("https://www.zigwheels.com/newcars");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(NewCarsLink);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement el2 = driver.findElement(By.cssSelector("#headerNewNavWrap > div.col-lg-10 > ul > li:nth-child(3) > ul > li > div.h-dd-r > ul > li:nth-child(2) > a"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Action moveOver = action
				.moveToElement(element)
				
				
				.build();
		moveOver.perform();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Action moveClick = action
				.moveToElement(el2)
				.click()
				.build();
		moveClick.perform();
		
		
		
		// driver.findElement(NewCarsLink).click();
		
		 
	}
	
    public static void NewCars(By under) {
		
		//driver.findElement(By.linkText(l)).click();
		
		driver.findElement(under).click();
	}
	
	
	

}
