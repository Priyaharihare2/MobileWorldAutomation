package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
	@Test
	  public void register() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.harihare\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://mobileworld.banyanpro.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
			driver.findElement(By.linkText("Sign up")).click();
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Priya");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Harihare");
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("priyaharihare@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pri@123");
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01/12/2002");
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			driver.findElement(By.xpath("//input[@min='0']")).sendKeys("8765432187");
			driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Hi");
			driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		    driver.quit();
			
			
			
	  }
}


