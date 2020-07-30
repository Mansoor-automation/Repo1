package CHECKING.TESTING;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws ParseException {

		// code to display the calendar
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/p/page6.html");

		driver.switchTo().frame("dateFrame"); 
 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		driver.findElement(By.id("datepicker")).click();

		// code to select date,mon,year in the calender

		String datetobeselected = "23/03/2026"; 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date formatteddate = sdf.parse(datetobeselected); 
 
		// Retrieve the day in integer value from the formatteddate

		String sday = new SimpleDateFormat("dd").format(formatteddate);
		int day = Integer.parseInt(sday);

		// Retrieve the month in integer vale from the formatteddate

		String smon = new SimpleDateFormat("MM").format(formatteddate);
		int month = Integer.parseInt(smon);

		// Retrieve the year in the integer vale from the formatted date

		String syr = new SimpleDateFormat("yyyy").format(formatteddate);
		int year = Integer.parseInt(syr);

		// logic to navigate to required year

		while (true) {
			String sdisplayedyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			int displayedyear = Integer.parseInt(sdisplayedyear);

			if (displayedyear == year) {

				break;
 
			} else if (displayedyear < year) {

				driver.findElement(By.xpath("//span[text()='Next']")).click();

			} else if (displayedyear > year) {

				driver.findElement(By.xpath("//span[text()='Prev']")).click();

			}

		}
//logic to navigate to req month and select the req date in the calender

		while (true) {
			
			String sdisplayedMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM");
			Date formatdate = sdf2.parse(sdisplayedMonth);
			String sm = new SimpleDateFormat("MM").format(formatdate);
			int sdisplayedmonth = Integer.parseInt(sm);
 
			if (sdisplayedmonth==month) {
				// select the date
				String datexpath = "//a[text()='"+day+"']";
				driver.findElement(By.xpath(datexpath)).click();
				
				break;
			} 
			else if (sdisplayedmonth < month) {
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			} 
			else if (sdisplayedmonth > month) {
				
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}

		}

	}

}
