package stephen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(5000);
		WebElement daylist=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select objsel=new Select(daylist);
		objsel.selectByVisibleText("15");
		
		//we are going to print the selected text as well as the other elements of the dropdown
		
		WebElement selectedtext=objsel.getFirstSelectedOption();
		System.out.println(selectedtext);
		
		List<WebElement> alloptions= objsel.getOptions();
		
		for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}
		
		
		
		
	}

}
