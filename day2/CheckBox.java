package week2.day2;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckBox {
	public static void checkBox()  {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://leafground.com/checkbox.xhtml");
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']/parent::div")).click();
		String text=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'TriState')]")).click();
		WebElement tristate =driver.findElement(By.xpath("//span[text()='State has been changed.']"));
		tristate.click();
		System.out.println(tristate.isSelected());
		if(tristate.isSelected()==true) {
			System.out.println("Tristate Checked");
		}
		else {
			System.out.println("Tristate Unchecked");
		}
		driver.findElement(By.xpath("//div[contains(@class,'toggleswitch-slider')]")).click();
		String switching=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(switching);
		WebElement isEnabled=driver.findElement(By.xpath("//div[contains(@class,'ui-state-disabled')]"));
		isEnabled.isEnabled();
		if(isEnabled.isEnabled()==true) {
			System.out.println("Enabled");
		}
		else {
			System.out.println("Disabled");
		}
		driver.findElement(By.xpath("//ul[contains(@class,'selectcheckboxmenu-multiple')]")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//ul[contains(@class,'selectcheckboxmenu-multiple')]")).click();
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//label[text()='Miami']")));
		 */
		driver.findElement(By.xpath("(//label[text()='Miami']) [2]")).click();
	}
    public static void main(String[] args)  {
		CheckBox.checkBox();
}

}
