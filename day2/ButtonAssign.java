package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonAssign {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("dashboard")) {
			System.out.println(title);
		}
		else {
			System.out.println("Mismatch");
		}
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement disableButton=driver.findElement(By.id("j_idt88:j_idt92"));
		//disableButton.click();
		if(disableButton.isEnabled()) {
			
		       System.out.println("enabled");
		}
		else {
			System.out.println("disabled");
		}
		

	}

}
