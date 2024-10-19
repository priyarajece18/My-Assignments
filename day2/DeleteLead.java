package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public void deleteLead() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8768766");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String text=driver.findElement(By.xpath("(//a[@class='linktext']) [4]")).getText();
		System.out.println(text);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//a[@class='linktext']) [4]")).click();
		  driver.findElement(By.xpath("//a[text()='Delete']")).click();
		  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		  driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		  Thread.sleep(1000);
		  String text1=driver.findElement(By.xpath("//div[contains(@class,'paging')]")).
		  getText(); System.out.println(text1);
	}

	public static void main(String[] args) throws InterruptedException {
		DeleteLead obj=new DeleteLead();
		obj.deleteLead();

	}

}
