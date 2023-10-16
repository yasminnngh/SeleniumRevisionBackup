package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 if(url.equals("https://www.amazon.com/")) {
		 System.out.println("URL is matching and test case has passed.");
	 }
		
	 else {
		 System.out.println("URL is not matching and test case has failed.");
	 }
		
	 driver.quit();
	}

	
	
}
