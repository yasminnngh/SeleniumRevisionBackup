package WebElements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 
		 TakesScreenshot screenshot = (TakesScreenshot) driver;
		 
		 File source = screenshot.getScreenshotAs(OutputType.FILE); 
		 
		 File target = new File("/Users/yasminghahramani/Documents/Selenium Screenshots/Screenshot.png"); 
		 
		 FileHandler.copy(source, target);
		 
		 Thread.sleep(2500);
		 
		 driver.quit();
		 
		 
	}

}
