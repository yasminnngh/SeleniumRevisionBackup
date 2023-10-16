package WebElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOfWebpage {

	public static WebDriver driver; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,2000)",""); 
		
		
	}

}
