package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import library.Repository;

public class NewCarsPage extends PageValidation {
	
	static WebDriver driver;
	public NewCarsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void NewCars() throws IOException {
		
		
		By NewCarsLink = Repository.o2();
		
		// pgvalid();
		// driver.get("https://www.zigwheels.com/newcars");
		 driver.findElement(NewCarsLink).click();
		
		 
	}
	
    public static void NewCars(By under) {
		
		//driver.findElement(By.linkText(l)).click();
		
		driver.findElement(under).click();
	}
	
	
	

}
