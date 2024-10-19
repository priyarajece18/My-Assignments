package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser3 {
	
	public static void launchbrowser() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Priya");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Prakash");
	    WebElement source=driver.findElement(By.xpath("//select[contains(@id,'SourceId')]"));
	    Select obj=new Select(source);
	    obj.selectByValue("LEAD_CONFERENCE");
	    driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
	    //get title
	    String title=driver.getTitle();
	    System.out.println(title);
	    //get currentURL
	    String currentURL=driver.getCurrentUrl();
	    System.out.println(currentURL);
	    //text from application
	    String text=driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    if(text.contains("Priya")) {
	    	System.out.println("Lead Created");
	    }
	    else {
	    	System.out.println("Lead is not Created");
	    }
	    driver.close();
	    
	}
	public static void main(String[] args) {
		LaunchBrowser3.launchbrowser();

	}

}
