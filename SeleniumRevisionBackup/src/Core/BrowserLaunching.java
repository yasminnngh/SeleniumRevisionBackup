package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {

	// Ex: public static int a
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Launching the specific browser by creating an instance for it &
		// storing it in WebDriver interface reference variable
		driver = new ChromeDriver();

		//Step 2: Maximizing the window
		driver.manage().window().maximize();

		//Step 3: Visit the URL by using get method. 
		driver.get("https://www.google.com/");

		//Step 4: Closing the browser by using quit method
		driver.quit();
	}

}
