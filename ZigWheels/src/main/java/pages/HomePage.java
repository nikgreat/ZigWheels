package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	static WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void home() {
		
		 driver.navigate().to("https://www.zigwheels.com");
	}
	

}
