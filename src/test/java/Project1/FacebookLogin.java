package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
//		Launch the Browser
		WebDriver driver = new ChromeDriver();

//		Open URL:  https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
//		Wait for 2 second
		Thread.sleep(2000);

//		Element find by id and auto fill text
		driver.findElement(By.id("email")).sendKeys("9873326870");
		driver.findElement(By.name("pass")).sendKeys("Smartboy@347");
		
//		Element find by tagname and Click to "login" button for login into facebook
		driver.findElement(By.tagName("button")).click();
		
		System.out.println("Login Successful");
		
		
		
//		Wait for 20 second
		Thread.sleep(20000);
		
//		Close the browser
		driver.quit();
;	}

}
