package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEditLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		fileName = "EditLead";
	}
	
	
//	@DataProvider(name = "fetchData")
//	
//	public String[][] senddata(){
//	String[][] data = new String[3][2];
//	
//	
//	data[0][0] = "9444416557";
//	data[0][1] = "TechM";
//	
//	data[1][0] = "9940486207";
//	data[1][1] = "HCL";
//	
//	data[2][0] = "9444436258";
//	data[2][1] = "Amazon";
//		
//		
//		return data;
//		
//		
//	}
//	String[][] = new Stringr[rowNum][cellNum];
	
	@Test(dataProvider = "fetchData")
	public void testngEditLead(String PhNo, String Compname) throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}

	}

}
