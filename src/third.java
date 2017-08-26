import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:/Selenium 5th batch/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://newtours.demoaut.com");
		
		
		driver.findElement (By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).submit();
				
		//implicit wait should be applied before the next page loads. or any mouse hover menu, or any time consuming content loading.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		----------------------------- Second page---------------------
//		Type
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
//		for static dropdowns : passenger
		Select dd1 = new Select(driver.findElement(By.name("passCount")));
		for (int i=0; i<=3; i++) 
		{
		dd1.selectByIndex(i);
		}
	}

}
