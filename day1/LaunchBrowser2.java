package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser2 {
	
	public static void launchbrowser() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("prakash");
		WebElement Employee=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj=new Select(Employee);
		obj.selectByIndex(3);
		WebElement Marketingcampign =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj1=new Select(Marketingcampign);
		obj1.selectByVisibleText("Car and Driver");
		WebElement Ownership =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj2=new Select(Ownership);
		obj2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
	}

	public static void main(String[] args) {
		LaunchBrowser2.launchbrowser();

	}

}
