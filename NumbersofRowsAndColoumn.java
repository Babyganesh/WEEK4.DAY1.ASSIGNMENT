package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumbersofRowsAndColoumn {

	public static void main(String[] args) {
		//  1. Launch the URL https://html.com/tags/table/
		//	2. Get the count of number of rows
		//	3. Get the count of number of columns
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//no of rows in table1
		       List<WebElement> rowsintable1 = driver.findElements(By.xpath("//table[1]//tr"));
		       int rowsize1 = rowsintable1.size();
		       System.out.println("no of rows in table1---"+rowsize1);
		       
		// Rows in Table2
				List<WebElement> rowintable2 = driver.findElements(By.xpath("(//table)[2]//tr"));
				int rowsize2 = rowintable2.size();
				System.out.println("no of Rows in table2 --- "+rowsize2);
				
		//coloumn in table1
		      List<WebElement> colointable1 = driver.findElements(By.xpath("//table[1]//th"));
		      int colosize1 = colointable1.size();
		      System.out.println("no ofcolumns in table1---"+colosize1);
		
				
		// Columns in Table2
				List<WebElement> coloumnintable2 = driver.findElements(By.xpath("(//table)[2]//th"));
				int columnsize2 = coloumnintable2.size();
				System.out.println("no of Columns in table2 ---- "+columnsize2);
			}}


