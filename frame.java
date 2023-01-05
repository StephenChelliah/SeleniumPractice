package stephen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://letcode.in/frame");
	    Thread.sleep(5000);
	    
	   WebElement frame1 =driver.findElement(By.xpath("//iframe[@id='firstFr']"));
	    
	    //driver.switchTo().frame(0);
	    driver.switchTo().frame(frame1);
	    driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Stephen");
	    driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Chelliah");
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Stephen@gmail.com");
	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	    
	    
	    
	    
	    
	    
	}

}
