package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {
	public static void main(String[] args) throws InterruptedException {

//		Launch the Browser
		WebDriver driver = new ChromeDriver();

//		Open URL:  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

//		Element find by name and auto fill text
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
//		Element find by tagname and Click to "login" button for login into web site
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("My Info")).click();
		
		
	}

}
