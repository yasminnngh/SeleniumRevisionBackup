package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDowns {
	
	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 Thread.sleep(2500);
		 
		 WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		 dropdown.click();
		 
		 Thread.sleep(2500);
		 
		 driver.findElement(By.xpath("//*[@id='dropdown-class-example']//*[@value='option2']")).click(); 
		 
		 Thread.sleep(2500);
		 
		 driver.quit();
		 
	}

}
