package Guru99demo.gittest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	WebDriver driver;
	public void Guru99Tutorials() {
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.guru99.com/");
String getTitle=driver.getTitle();
System.out.println(getTitle);
driver.close();
}
}