package stephen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(10000);
		//To Fetch a data based on location
		WebElement First=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]"));
		//System.out.println(First.getText());
		List<WebElement> companies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> Group=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		List<WebElement> Previousclose=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		List<WebElement> CurrentPrice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		List<WebElement> change=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
		
		
		int value =companies.size();
		System.out.println("value");
		//To fetch a data based on Value
		
		for(int i=0;i<companies.size();i++){
			if(companies.get(i).getText().equals("Hemang Resources"))
			{
				System.out.println(Group.get(i).getText());
				System.out.println(Previousclose.get(i).getText());
				System.out.println(CurrentPrice.get(i).getText());
				System.out.println(change.get(i).getText());
			}
		}
		
		
	}

}
