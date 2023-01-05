package stephen;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandlingpopupswithiterator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Set<String> windowhandling =driver.getWindowHandles();
		Iterator<String>  itrobj =windowhandling.iterator();
		//The above line of code returns a set with an Iterator pointer above it.
		String parentwindow=itrobj.next();
		String childwindow=itrobj.next();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		//The above line of code reminds us that Despite of the child window being loaded and occupying the entire screen. The control hasn't changed to do that we need to use switchTo method.
		driver.switchTo().window(childwindow);
		String currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		driver.switchTo().window(parentwindow);
		
		
		
		
		
		
	}

}
