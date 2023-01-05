package stephen;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandlingwithsetandlist {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home")).click();
		Set<String> allwindows=driver.getWindowHandles();
		List<String> wind=new ArrayList<String>(allwindows);
		String currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		driver.switchTo().window(wind.get(1));
        currenturl1=driver.getCurrentUrl();	
        System.out.println(currenturl1);
		Thread.sleep(5000);
		driver.switchTo().window(wind.get(0));
		currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		
		
	}

}
