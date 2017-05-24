package rozetka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseTest {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://rozetka.com.ua/");
		
	  }

	  @AfterClass
	  public void afterClass() {
			  driver.quit();	  }
	
}
