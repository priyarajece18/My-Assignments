package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void createLead() {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("prakash");
		String Title=driver.getTitle();
		driver.close();
		if(Title.contains("leaf")) {
		System.out.println(Title);
		}
		else {
			System.out.println("No matches found");
		}
	}

	public static void main(String[] args) {
		CreateLead.createLead();

	}

}
