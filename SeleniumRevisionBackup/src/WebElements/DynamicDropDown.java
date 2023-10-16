package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static WebDriver driver;

	public static void selectYear(String yearFromuser) throws InterruptedException {

		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));

		Thread.sleep(2500);

		for (WebElement year : years) {

			String text = year.getText();

			if (text.equals(yearFromuser)) {
				year.click();
				break;
			}

		}

	}

	public static void selectMonth(String monthFromuser) throws InterruptedException {

		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));

		Thread.sleep(2500);

		for (WebElement month : months) {

			String text = month.getText();

			if (text.equalsIgnoreCase(monthFromuser)) {
				month.click();
				break;
			}

		}

	}

	
	public static void selectDay(String dayFromuser) {
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));

		for (int i = 0; i <= days.size(); i++) {

			String text = days.get(i).getText();

			if (text.equals(dayFromuser)) {
				days.get(i).click();
				break;
			}
		}

	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

		Thread.sleep(2500);

		selectYear("1998");
		
		selectMonth("Feb"); 
		
		selectDay("18"); 
		
	}

}
