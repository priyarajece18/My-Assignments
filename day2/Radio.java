package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		System.out.println(driver.findElement(By.xpath("(//span[contains(@class,'bullet')])[4]")).isEnabled());
		List<WebElement> options=driver.findElements(By.xpath("//input[contains(@name,'console2') and contains(@value,'Option')]"));
		
		for(int i=0;i<=options.size()-1;i++) {
			//System.out.println(options.get(i));
			if(options.get(i).isEnabled()) {
			System.out.println("enabled");
			}
		}
		/*
		 * List<WebElement> age=driver.findElements(By.
		 * xpath("//input[contains(@id,'age')and contains(@name,'age')]"));
		 * 
		 * for(int j=0;j<=age.size()-1;j++) { if(age.get(j).isSelected()) {
		 * System.out.println("checked"); } else { System.out.println("unchecked"); } }
		 */
			driver.close();
		}
		
		
		
	

	

}
