package selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12813\\eclipse-workspace\\javaprograms\\SeleniumConcepts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/grid.xhtml");
		
		// To print the row size
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		
		// To print the column size
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println(columnCount);
		
		
		
	}
	
	

}
