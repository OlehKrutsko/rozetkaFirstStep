package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
	
	private WebDriver driver;
	
	public ResultPage(WebDriver driver) {
			this.driver = driver;	 
	}

	public WebElement getFirstLink()	{
		return  driver.findElement(By.xpath(".//*[@id='block_with_search']/div/div[2]/div/div/div/div[2]/div[2]/a"));
			}
	

}
