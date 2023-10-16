package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 Thread.sleep(2500);
		 
		 WebElement button = driver.findElement(By.xpath("//input[@value='radio1']")); 
		 
		 boolean check1 = button.isDisplayed();
		 
		 boolean check2 = button.isEnabled();
		 
		 if(check1 == true && check2 == true) {
			 System.out.println("Button is displayed and enabled.");
			 
			 button.click();
		 }
		
		 
		 else {
			 System.out.println("Button is not displayed and disabled.");
		 }
		 
		 
		 boolean check3 = button.isSelected();
		 
		 if(check3 == true) {
			 System.out.println("Button is selected and test case is passed.");
		 }
		 
		 else {
			 System.out.println("Button is not selected and test case is failed.");
		 }
		 
		 
		 driver.quit();
	}

}
