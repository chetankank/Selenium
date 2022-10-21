package Pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {

	public static WebDriver openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\backup\\d\\backupc\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;

	}

}
