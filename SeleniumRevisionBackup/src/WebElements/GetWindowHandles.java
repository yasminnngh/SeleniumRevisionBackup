package WebElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new ChromeDriver(); 
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 
		 Thread.sleep(5000);
		 
		 
		Set <String> windowIds= driver.getWindowHandles();
		
		Iterator <String> it = windowIds.iterator();
		
		String id1 = it.next(); 
		
		String id2 = it.next();
		
		System.out.println(id1);
		System.out.println(id2);
		
		driver.switchTo().window(id2);
		
		Thread.sleep(5000);
		
		driver.switchTo().window(id1);
		
		driver.switchTo().window(id2); 
		
		Thread.sleep(2500);
		
		driver.close();
		
		driver.quit();
	}

}
