package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static WebDriver driver; 
	
	public static void autoSuggestion(String letters, String states) throws InterruptedException {
		
		
		WebElement autoSuggestionDropdown = driver.findElement(By.id("autocomplete"));
		autoSuggestionDropdown.click();
		
		Thread.sleep(2500);
		
		autoSuggestionDropdown.sendKeys(letters);
		
		Thread.sleep(2500);
		
		
		List <WebElement> nations = driver.findElements(By.className("ui-menu-item-wrapper"));
		
		for(WebElement nation : nations) {
			String text = nation.getText();
			
			if(text.equalsIgnoreCase(states)) {
				nation.click();
				
			}
			
		}	
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		autoSuggestion("ar", "Antarctica"); 
	
		Thread.sleep(2500);
		
	}

}
