package CHECKING.TESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoChecker1 {

	static WebDriver driver = null;
//	opening browser
	@Test
	public void url()
//    public static void main(String[] args)		
	{
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
    }

}
