package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// initiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("https://login.salesforce.com/");

		// maximize the window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// close the window
		// driver.close();

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Leaf@123");

		// close the window
		driver.close();

	}

}
