package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')]//div)[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Checked']"));
		System.out.println(checkbox.getText());
		
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		
		WebElement msg = driver.findElement(By.xpath("//p[text()='State = 1']"));
		System.out.println(msg.getText());
		
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		WebElement checkedmsg = driver.findElement(By.xpath("//span[text()='Checked']"));
		System.out.println(checkedmsg.getText());
		
		boolean Selected = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isSelected();
		System.out.println(Selected);
		
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		driver.close();
		
		
		
	}

}
