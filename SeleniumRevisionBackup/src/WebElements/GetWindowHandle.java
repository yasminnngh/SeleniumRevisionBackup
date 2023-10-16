package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2500);
		
		String windowID = driver.getWindowHandle(); 
		System.out.println(windowID);
		
		//3FAE09061B5037815C665F86F577A449
		
		//516B28C4FB0F71B50D49BD935CA677CE

		// This is used to locate the hyperlink
		// driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		// This is using partial link text to locate the hyperlink, by providing minimal
		// amount of characters.
		// driver.findElement(By.partialLinkText("OrangeHRM")).click();


		driver.quit();
		
		
	}

}
