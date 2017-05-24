package rozetkaPages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

	private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

	protected Properties prop;

	public static WebDriver getDriver() {
		return webDriver.get();
	}

	public void setUp() {
		if (getDriver() == null) {
			ChromeDriver chromeDriver = new ChromeDriver();
			chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webDriver.set(chromeDriver);
		}
	}

	public void tearDown() {
		if (getDriver() != null) {
			webDriver.remove();
		}
	}

	public BaseDriver() {
		setUp();
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					"D:\\Automation\\rozetkaFirstStep\\src\\main\\resources\\config\\config.properties");
			prop.load(file);
			getDriver().get(prop.getProperty("BaseUrl"));
		} catch (Exception e) {
			System.out.println("read error");
		}
	}

}
