package stephen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownwithoutSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> alloptions= driver.findElements(By.xpath("//select[contains(@name,'DOB_Day')]/child::option"));
		for(int i=0;i<alloptions.size();i++)
		{
			if(alloptions.get(i).getText().equalsIgnoreCase("05")) 
			{
	         alloptions.get(i).click();
			System.out.println(alloptions.get(i).getText());
		     }
			
		}
		
	}

}
