package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	@Test
	public void openbrowser(){
	System.setProperty("webdriver.gecko.driver","C:\\Users\\sonia\\eclipse-workspace\\LearnJava\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");

	}
}
