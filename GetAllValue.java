package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllValue {

	public static void main(String[] args) {
		
		// Launch the URL https://html.com/tags/table/
	   // You have to print the respective values based on given Library
	   //  (hint: if the library was absolute usage, then print all its value)
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
// You have to print the respective values based on given Library
		 String marketShare= driver.findElement(By.xpath("((//table)[1]//tr)[2]/td[1]")).getText();
		 System.out.println(marketShare);
		 
//Market Share list		
		 List<String> listmarketShare=new ArrayList<String>();
			for(int i = 1 ; i<=4 ;i++) {
				
				 String marketShare1 = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td["+i+"]")).getText();
				 listmarketShare.add(marketShare1);
			}    System.out.println("MarketShare value--"+ listmarketShare);
			
		  String library2 = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td[1]")).getText();
		  System.out.println(library2);
		  
//Absoluteusage List		  
		  List<String>absoluteUsage1=new ArrayList<String>();
		  for (int j =1; j<=4; j++) {
			
			String absoluteUsage = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td["+j+"]")).getText();
			absoluteUsage1.add(absoluteUsage);
		}
		
		System.out.println("AbsoluteUsage value--"+absoluteUsage1 );
	   }}			
			
		