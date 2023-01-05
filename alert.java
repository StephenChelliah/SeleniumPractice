package stephen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/alert");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='accept']")).click();
	Thread.sleep(5000);
	Alert alt=driver.switchTo().alert();
	String content=alt.getText();
	System.out.println(content);
	Thread.sleep(5000);
	alt.accept();
	
	
	 
	 
	 
}

}
