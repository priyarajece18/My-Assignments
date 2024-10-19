package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void dropDown() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" http://leaftaps.com/opentaps/.");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("SeleniumPriya5");
	    WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		industry.click();
		Select industrydd=new Select(industry);
		industrydd.selectByValue("IND_SOFTWARE");
		WebElement onwership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		onwership.click();
		Select ownershipdd=new Select(onwership);
		ownershipdd.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.id("dataSourceId"));
		source.click();
		Select sourcedd=new Select(source);
		sourcedd.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		marketing.click();
		Select marketingdd=new Select(marketing);
		marketingdd.selectByIndex(6);
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		state.click();
		Select statedd=new Select(state);
		statedd.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement accname=driver.findElement(By.xpath("//span[contains(text(),'Selenium')]"));
		if(accname.isDisplayed()) {
			System.out.println(accname);
		}
		else {
			System.out.println("Account creation failed");
		}
	}

	public static void main(String[] args) {
		//CreateLead.createLead();
		DropDown.dropDown();

	}

}
