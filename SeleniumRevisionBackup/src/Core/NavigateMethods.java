package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//Navigate purpose is get from one webpage to another
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.12.1");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
	}

}
