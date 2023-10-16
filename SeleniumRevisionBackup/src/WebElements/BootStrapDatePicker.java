package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDatePicker {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(2500);
		
		
		driver.findElement(By.id("datepicker1")).click();
		
		Thread.sleep(2500);
		
		
		int i = 1; 
		while(i > 0) {
			
		WebElement header = driver.findElement(By.xpath("//*[@class ='ui-datepicker-title']"));
		
		String text = header.getText();		
		
		if(!(text.equalsIgnoreCase("February 1998"))) {
		
			driver.findElement(By.xpath("//*[@class = 'ui-icon ui-icon-circle-triangle-w']")).click();	
		}
		
		else {
			break; 
		}
		}
		
		Thread.sleep(2500);
		
		List <WebElement> days = driver.findElements(By.xpath("//tbody//tr//td//a"));
		
		for(WebElement day : days) {
			String text = day.getText();
			
			if(text.equalsIgnoreCase("18")) {
				day.click();
			}
		}
		
		
		
		
	}

}
