package GithubDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoSignIn {

	
	public static WebDriver driver;
	
	@Test(priority = '1')
	public void signIn() {
		
		driver =  new FirefoxDriver();
		
		 driver.findElement(By.name("userName")).sendKeys("Username1");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.name("login")).click();
			driver.close();
		
		
	}
}
