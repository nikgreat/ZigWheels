package library;



import org.openqa.selenium.By;

public class Repository {
	
	public static By object() {
		
		By cu4l = By.linkText("Cars under 4 Lakh");
		 
		 return cu4l;
	}
	
	public static By o2() {
		
		By nclink = By.xpath("//*[@id=\"headerNewNavWrap\"]/div[2]/ul/li[2]/a");
		
		return nclink;
	}

}
