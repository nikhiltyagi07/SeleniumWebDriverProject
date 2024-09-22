package Project1;

/*
Test case
-------
1) Launch browser (Chrome)
2) Open URL  https://demo.opencart.com/
3) Validate title should be   "Your Store"
4) Close browser

*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static void main(String[] args) {

//		Launch the Browser
		WebDriver driver = new ChromeDriver();

//		Open URL:  https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");

//		Validate title should be   "Your Store"
		String act_title = driver.getTitle();
		
		if (act_title.equals("Your Store")) {
			
			System.out.println("Test case Passed");
		} else {
			System.out.println("Test case Failed");
		}

//		Close the browser
		driver.quit();
	}

}