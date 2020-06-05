package GithubDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Demoopenpage {

	public static WebDriver driver;
	
	@BeforeClass
	public void Pageopen() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		
	}
	
}
