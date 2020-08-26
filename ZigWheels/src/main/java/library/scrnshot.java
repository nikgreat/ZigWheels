package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class scrnshot {
	static WebDriver driver;
	
	  public scrnshot(WebDriver driver) { 
		  this.driver = driver; }
	 
	
	public void takeSnapShot(String location) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(location);
		FileUtils.copyFile(scrFile, DestFile);
		
		
	}

}
