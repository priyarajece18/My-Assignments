package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public static void createAccount() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" http://leaftaps.com/opentaps/");
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demosalesmanager");
		String name=username.getAttribute("value");
		System.out.println(name);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("SeleniumPriya001");
		driver.findElement(By.xpath("//input[contains(@name,'Employees')]")).sendKeys("3");
		driver.findElement(By.xpath("//input[contains(@name,'officeSiteName')]")).sendKeys("Leaftaps");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		String title=driver.getTitle();
		if(title.contains("djweu")) {
			System.out.println(title);
		}
		else {
			System.out.println("No matches found");
		}
		driver.close();
		 
	}

	public static void main(String[] args) {
		CreateAccount.createAccount();

	}

}
