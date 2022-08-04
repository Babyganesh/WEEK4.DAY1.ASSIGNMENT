package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittograph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //1. Launch the URL https://www.chittorgarh.com/
			//2. Click on stock market
			//3. Click on NSE bulk Deals
			//4. Get all the Security names
			//5. Ensure whether there are duplicate Security names
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.chittorgarh.com/");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//2. Click on stock market
		WebElement stockmarket = driver.findElement(By.id("navbtn_stockmarket"));
		stockmarket.click();
		
	//3. Click on NSE bulk Deals
		WebElement nsebulk = driver.findElement(By.linkText("NSE Bulk Deals"));
		nsebulk.click();
		
		String header = driver.findElement(By.xpath("(//table)[2]//tr//th[3]")).getText();
		System.out.println(header);		 
	    List<WebElement> rowssize = driver.findElements(By.xpath("(//table)[2]//tr"));
		int size = rowssize.size();
		System.out.println(size);
		
     //4.get all security name
	    for (int i = 1; i < size; i++) {
	    String allnames = driver.findElement(By.xpath("(//table)[2]//tr["+i+"]/td[3]")).getText();
	    System.out.println(allnames);
		 
     //5.  Ensure whether there are duplicate Security names
        List<String> rowList=new ArrayList<String>();
        rowList.add(allnames);
        Set<String>dupname=new LinkedHashSet<String>(size);
        int size2 = dupname.size();
        System.out.println(size2);
	    
        if ( dupname.size()==rowList.size()) {
        	System.out.println("It has no duplicates");
		}
		else {
			System.out.println("It has duplicates");
			
		}}}

}

