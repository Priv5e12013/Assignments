package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("createlead")).click();
		driver.findElement(By.id("createleadform_companyname")).sendKeys("veetech");
		driver.findElement(By.id("createleadform_firstname")).sendKeys("Priyanka");
		driver.findElement(By.id("createleadform_lastname")).sendKeys("Mani");
		driver.findElement(By.id("createleadform_firstnamelocal")).sendKeys("Priv5e12013");
		driver.findElement(By.id("createleadform_departmentname")).sendKeys("medicallbilling");
		driver.findElement(By.id("createleadform_description")).sendKeys("ThinkPositive");
		driver.findElement(By.id("createleadform_primaryemail")).sendKeys("Priv5e12013@gmail.com");
		Select country = new Select(driver.findElement(By.id("createleadform_generalStateProvinceGold")));
		country.selectByVisibleText("NewYork");
		driver.findElement(By.className("smallsubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateleadform_description")).clear();
		driver.findElement(By.id("updateleadform_importantnote")).sendKeys("HCPNV");
		driver.findElement(By.className("smallsubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.getTitle();
	}

}
