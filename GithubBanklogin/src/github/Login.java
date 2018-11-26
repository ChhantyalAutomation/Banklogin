/**
 * 
 */
package github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Meena Chhantyal
 *
 */
public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("ChhantyalAutomaiton");
		driver.findElement(By.name("password")).sendKeys("");
		
		driver.findElement(By.name("commit")).click();
		driver.quit();
		
}
}