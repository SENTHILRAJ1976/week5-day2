package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// initiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// close the window
		// driver.close();

		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Leads")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TechM");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Senthil");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajsenthil76@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9444416557");
		
		
		Thread.sleep(2000);

		// close the window
		driver.close();

		
		
		
		

	}

}
