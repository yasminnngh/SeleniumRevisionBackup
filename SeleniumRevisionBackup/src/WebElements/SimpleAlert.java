package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver(); 
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 
		 
		WebElement simpleAlert = driver.findElement(By.xpath("//*[@name = 'alert']"));
		simpleAlert.click();
		
		Thread.sleep(2500);
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		 driver.switchTo().alert().accept();
		 
		 
		 driver.quit();
		 
	}

}
