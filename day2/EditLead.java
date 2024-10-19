package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf@1234");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("prakash2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("local2");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium1");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium with Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya@er.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.click();
		Select dd=new Select(state);
		dd.selectByVisibleText("Alaska");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("description cleared");
		driver.findElement(By.name("submitButton")).click();
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		driver.close();
		
		
		
		

	}

}
