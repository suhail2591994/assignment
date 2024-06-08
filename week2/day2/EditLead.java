package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Muhamad");
		
		driver.findElement(By.xpath("(//input[contains(@name,'lastName')])[3]")).sendKeys("Suhail");
		
		driver.findElement(By.xpath("(//input[contains(@name,'firstNameLocal')])")).sendKeys("Muhamad");
		
        driver.findElement(By.xpath("(//input[contains(@name,'departmentName')])")).sendKeys("testing");
        
        driver.findElement(By.name("description")).sendKeys("Using a testing software");
        
        driver.findElement(By.name("primaryEmail")).sendKeys("suhaildaring@gmail.com");
        
        WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options = new Select(state);
		options.selectByIndex(2);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
        driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("description")).sendKeys("This is an automation testing");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
		
		
		
	}

}
