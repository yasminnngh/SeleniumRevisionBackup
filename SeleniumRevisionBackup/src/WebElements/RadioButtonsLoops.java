package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsLoops {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 Thread.sleep(2500);
		 
		 List <WebElement> buttons = driver.findElements(By.name("radioButton")); 
		 
		 
		 for(WebElement button : buttons) {
			 
			 button.click();
		
			 Thread.sleep(2500);
			 
			 
			 
		 }
		 
		 
		 driver.quit();
		 
	}

}
