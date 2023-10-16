package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractDataOfWebTable {

	public static WebDriver driver;
	
	public static int total; 
	
	public static int number; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 Thread.sleep(2500);
		 
		List <WebElement> amounts = driver.findElements(By.xpath("//*[@class='tableFixHead']//tbody//tr//td[4]"));
		 
		Thread.sleep(2500);
		
		for(WebElement amount : amounts) {
			String text = amount.getText();
			System.out.println(text);
			
		//Integer.ParseInt means converting the String text to integer value
		int value = Integer.parseInt(text);
		
			total = total + value; 
		}
		 
		System.out.println("Total Amount : " + total);
		
		WebElement notification = driver.findElement(By.xpath("//*[@class = 'totalAmount']"));
		 String text = notification.getText(); 
		
		 String [] words = text.split("\\s"); 
		 
		 for(String word : words) {
			 
			 if(word.equals("296")) {
				 
				 
			 number = Integer.parseInt(word); 
				 break; 
			 }
		 }
		
		 System.out.println(number);
		 
		 if(total == number) {
			 System.out.println("Figures are matching test case is passed.");
		 }
		
		 else {
			 System.out.println("Figures are not matching and test case failed.");
		 }
		 
	}

}
