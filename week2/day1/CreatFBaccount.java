package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatFBaccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("john");
		
		driver.findElement(By.name("lastname")).sendKeys("jacob");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9776589045");
		
		driver.findElement(By.id("password_step_input")).sendKeys("tigerandfolks66");
		
		
		WebElement Day = driver.findElement(By.id("day"));
		Select options = new Select(Day);
		options.selectByValue("6");
		
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select options1 = new Select(Month);
		options1.selectByIndex(9);
		
		WebElement Year = driver.findElement(By.id("year"));
	    Select options2 = new Select(Year);
	    options2.selectByValue("1994");
	    
	    driver.findElement(By.linkText("Male")).click();
	    
	
	}

}
