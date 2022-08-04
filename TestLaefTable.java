package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLaefTable {

	public static void main(String[] args) throws InterruptedException {
		
//Get the count of number of columns

//Get the count of number of rows

//Get the progress value of 'Learn to interact with Elements'

//Check the vital task for the least completed progress.
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//Get the count of number of columns
		List<WebElement> columncount = driver.findElements(By.xpath("//table//th"));
		int columnsize = columncount.size();
		System.out.println(columnsize);
		
//count Of Rows
		List<WebElement> rowcount = driver.findElements(By.xpath("//table//tr"));
		int rowsize = rowcount.size();
		System.out.println(rowsize);
		
//Get the progress value of 'Learn to interact with Elements'
		String text = driver.findElement(By.xpath("//table//tr[3]")).getText();
		System.out.println(text );
		
		for (int i = 3; i <=5; i++) {
			String text2 = driver.findElement(By.xpath("//table//tr["+i+"]/td[2]")).getText();
			System.out.println(text2);
			Thread.sleep(2000);
	//to find min value
			List<WebElement> leastprogress = driver.findElements(By.tagName("tr"));	
			List<String> values = new ArrayList<String>();
			for (int j = 1; j < leastprogress.size(); j++) {
			values.add(leastprogress.get(j).getText());
			System.out.println(leastprogress.get(j).getText());
			
		}
			Object obj =Collections.min(values);
			System.out.println("Minimum Value : "+obj);
			driver.findElement(By.xpath("//table//tr[6]/td[3]/input")).click();

			 }
					 
	        
				
			}
		}

		
			
		
		
		
	 










