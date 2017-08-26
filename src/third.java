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
//		Radio button Type
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
//		for static dropdowns : passenger
		Select dd1 = new Select(driver.findElement(By.name("passCount")));
		for (int i=0; i<=3; i++) 
		{
		dd1.selectByIndex(i);
		}
		
//		dropdowns: departing from 
		Select dd2 = new Select(driver.findElement(By.name("fromPort")));
		for (int i=0; i<=9; i++) 
		{
		dd2.selectByIndex(i);
		}
		
//		Dropdowns date month
		Select dd3 = new Select (driver.findElement(By.name("fromMonth")));
		for (int i=0; i<=11; i++)
		{
			dd3.selectByIndex(i);
		}

		
//		day
		Select dd4 = new Select (driver.findElement(By.name("fromDay")));
		for (int i=0; i<=30; i++)
		{
			dd4.selectByIndex(i);
		}
		
		
//		departing from
		Select dd5 = new Select(driver.findElement(By.name("toPort")));
		for (int i=0; i<=10; i++)
		{
		dd5.selectByIndex(i);
		}
		
//		returning month
		Select dd6 = new Select (driver.findElement(By.name("toMonth")));
		for (int i=0; i<=30; i++)
		{
		dd6.selectByIndex(i);
		}

		
		
//		retuning day
		Select dd7 = new Select (driver.findElement(By.name("toDay")));
		for (int i=0; i<=30; i++)
		{
		dd7.selectByIndex(i);
		}
		
//		service class
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();

		

		

	}

}
