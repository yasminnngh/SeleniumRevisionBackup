package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownFacebook {
	
	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		 Thread.sleep(2500);
		 
		 
		 WebElement yearDropdown = driver.findElement(By.id("year"));
		 
		 WebElement monthDropdown = driver.findElement(By.id("month")); 
		 
		 WebElement dayDropdown =  driver.findElement(By.xpath("//select[@id = 'day']")); 
		 
		 
		 //"year" is object reference variable and "new Select" is object.
		Select year = new Select(yearDropdown); 
		 
		Select month = new Select(monthDropdown); 
		
		Select day = new Select(dayDropdown); 
		
		year.selectByValue("1998");
		
		Thread.sleep(2500);
		
		month.selectByVisibleText("Feb");
		
		Thread.sleep(2500);
		
		day.selectByIndex(17);
		
		Thread.sleep(2500);
		
		driver.quit();
		
		
	}

}
