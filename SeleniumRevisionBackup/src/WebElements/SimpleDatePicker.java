package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleDatePicker {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
		 
		 Thread.sleep(2500);
		 
		 driver.findElement(By.id("datepicker2")).click();
		 
		 Thread.sleep(2500);
		 
		 
		 for(int i = 1; i <= 1; i++ ) {
			 
		List <WebElement> years = driver.findElements(By.xpath("//*[@title = 'Change the year']//option"));
		 
		 years.get(0).click();

		 }
		 
		 Thread.sleep(2500);
		 
		 
		WebElement yearDropdown = driver.findElement(By.xpath("//*[@ title = 'Change the year']"));
		 
		Select obj = new Select(yearDropdown); 
		obj.selectByVisibleText("1998");
		 
		Thread.sleep(2500);
		
		
		
		WebElement monthsDropdown = driver.findElement(By.xpath("//*[@title='Change the month']")); 
		
		Select obj1 = new Select(monthsDropdown); 
		obj1.selectByVisibleText("February");
		
		Thread.sleep(2500);
		
		
		List <WebElement> days = driver.findElements(By.xpath("//tbody//tr//td//a"));
		
		for(WebElement day : days) {
			String text = day.getText();
			
			if(text.equals("18")) {
				day.click();
			}
		}
		
		Thread.sleep(2500);
		
		
		
		
		
	}

}
