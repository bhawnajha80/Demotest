package GithubDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demoopenpage {

	public static WebDriver driver;
	
	@Test
	public void Pageopen() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Bhawna\\Java Selenium links\\FireFoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		
	}
	
}
