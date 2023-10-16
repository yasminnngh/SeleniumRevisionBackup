package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingAllCheckbox {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	 driver = new ChromeDriver(); 
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 Thread.sleep(2500);
	 
	 
	 WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
	 	username.sendKeys("Admin");
		Thread.sleep(2500);
	 	
	 	
	 WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
	 	password.sendKeys("admin123");
	 	Thread.sleep(2500);
	 	
	 	
	 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	 	loginButton.click();
	 	Thread.sleep(2500);
	 	
	 	driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
	 	Thread.sleep(2500);
	 	
	 	List < WebElement > boxes = driver.findElements(By.xpath("//*[@class='orangehrm-container']//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
	 	
	 	for(int i = 1; i < boxes.size(); i++) {
	 		
	 		//even
	 		if(i%2==0) {
	 		boxes.get(i).click();
	 		}
	 		
	 	
	 		
	 		
	 		
	 		
	 	}
	 	
	 	
	 	
	 	
	}

}
