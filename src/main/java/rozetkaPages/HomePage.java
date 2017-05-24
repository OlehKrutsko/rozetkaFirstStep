package rozetkaPages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseDriver {
	private final String homepage = "http://rozetka.com.ua/";

	public HomePage() {
		super();
	}

	public ResultPage search(String text) {
		WebElement findElement = getDriver().findElement(By.xpath(".//*[@id='rz-search']/form/div[1]/div[2]/input"));
		findElement.sendKeys(text);
		findElement.submit();
		return new ResultPage(getDriver());

	}

	public boolean isOpen() {
		return getDriver().getCurrentUrl().equals(homepage);
	}

	public void assertIsOpen() {
		assertTrue(isOpen(), "Home Page isn't open");
	}

	

}
