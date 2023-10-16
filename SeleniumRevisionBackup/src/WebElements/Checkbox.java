package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static WebDriver driver; 
	
	public static void main (String [] args) throws InterruptedException {
		
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//locator1 ID
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		boolean check1 = checkbox.isDisplayed();
		
		boolean check2 = checkbox.isEnabled();
		
		if(check1 == true && check2 == true) {
			checkbox.click();
		}
		
		boolean check3 = checkbox.isSelected();
		
		if(check3) {
			System.out.println("Test Case Passed.");
		}
		
		else {
			System.out.println("Test Case Failed.");
		}
		
		
		Thread.sleep(2500);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
}
