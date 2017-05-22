package rozetka;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest{
private String homepage = "http://rozetka.com.ua/" ;

  public HomePage(WebDriver driver){
	  this.driver = driver;
	  
  }
  
   public ResultPage search(String text){
	 WebElement findElement = driver.findElement(By.xpath(".//*[@id='rz-search']/form/div[1]/div[2]/input"));
	 findElement.sendKeys(text);
	 findElement.submit();
	 return new ResultPage(driver);
	 
 }

  public boolean isOpen(){
	  return driver.getCurrentUrl().equals(homepage);
	   }
  
  public void asserIsOpen(){
	  assertTrue(isOpen(), "Home Page isn't open");
  }
  
  public void open(){
	  driver.get(homepage);
  }

}
