package stephen;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingwithsetandforloop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
	   // List<String> twowins=new ArrayList<String>(allwindows);
		//driver.switchTo().window(twowins.get(1));
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Product")).click();
		//Now are applying ForEach loop and inserting set.
		for(String Localvariable:allwindows)
		{
			//if(!parentwindow.equals(allwindows))
			//{
				driver.switchTo().window(Localvariable);
				Thread.sleep(5000);
				String currenturl=driver.getCurrentUrl();
				System.out.println(currenturl);
				driver.close();
				
			//}
				
			
			
		}
		
		
	}
	

}
