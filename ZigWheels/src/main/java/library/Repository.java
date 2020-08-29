package library;



import org.openqa.selenium.By;

public class Repository {
	
	public static By object() {
		
		//By cu4l = By.linkText("Cars under 4 Lakh");
		By cu4l = By.xpath("//*[@id=\"zw-cmnSilder\"]/a");
		 
		 return cu4l;
	}
	
	public static By o2() {
		
//		By nclink = By.xpath("//*[@id=\"headerNewNavWrap\"]/div[2]/ul/li[2]/a");
		
		By nblink = By.xpath("//*[@id=\"headerNewNavWrap\"]/div[2]/ul/li[3]/a");
		
		return nblink;
	}

}
