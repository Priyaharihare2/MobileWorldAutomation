package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signin {
	  @Test
	  public void register() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.harihare\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://mobileworld.banyanpro.com/");
			driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
			Thread.sleep(100);
			driver.findElement(By.id("username")).sendKeys("Priya.harihare");
		    Thread.sleep(100);
		    driver.findElement(By.id("password")).sendKeys("Pri@123");
		    Thread.sleep(100);
					
			
	  }
}
