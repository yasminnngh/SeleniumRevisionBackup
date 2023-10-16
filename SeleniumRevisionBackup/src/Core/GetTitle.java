package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static WebDriver driver; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 
		 String title = driver.getTitle();
		 
		 if(title.equals("Google")) {
			 System.out.println("Title is matching and test case has passed.");
		 }
		 
		 else {
			 System.out.println("Title is not matching and test case has failed.");
		 }
		 
		 
		 driver.quit();
		
		
	}

}
