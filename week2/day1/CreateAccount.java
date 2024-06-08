package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public static void main(String[] args) throws InterruptedException {
		
    ChromeDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("http://leaftaps.com/opentaps/control/main");
    
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    Thread.sleep(2000);
    
    driver.findElement(By.className("decorativeSubmit")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.linkText("CRM/SFA")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.linkText("Accounts")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.linkText("Create Account")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
    
    Thread.sleep(2000);

    driver.findElement(By.id("numberEmployees")).sendKeys("8");
    
    Thread.sleep(2000);

    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
    
    Thread.sleep(2000);

    driver.findElement(By.className("smallSubmit")).click();
    
    String title = driver.getTitle();
    System.out.println(title);
    
    if (title.contains("TestLeaf")) {
    	System.out.println("It is Correct");
    }
    	else {
			System.out.println("It is not Correct");
		}
		
    driver.close();
	}
    
    
    
     
    
}


