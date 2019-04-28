package BrowsersDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main (String args []) {
		
		String baseUrl = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "E:\\01_UDEMY\\SeleniumCourse\\Libraries\\Gheko\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
}
