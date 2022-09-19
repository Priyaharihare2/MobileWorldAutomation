package order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void order1() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.harihare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.banyanpro.com/");
		LandingPage ordr = new LandingPage(driver);

		ordr.ordr("Priya","Harihare","priyaharihare@gmail.com", "pri123", "1234567898","Sai shiva homes", "Nagawara","Bangalore", "5464789654", "1", "3");

	}


  }

