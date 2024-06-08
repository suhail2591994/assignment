package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		    
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.className("decorativeSubmit")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.linkText("Accounts")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.linkText("Create Account")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		    
		    Thread.sleep(1000);
		    
		    WebElement industry = driver.findElement(By.name("industryEnumId"));
		    
		    Select options = new Select(industry);
		    
		    options.selectByIndex(3);
		    
		    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		
		    Select options1 = new Select(ownership);
		    
		    options1.selectByVisibleText("Corporation");
		    
		    WebElement source = driver.findElement(By.name("dataSourceId"));
		    
		    Select options2 = new Select(source);
		    
		    options2.selectByValue("LEAD_EMPLOYEE");
		    
		    WebElement Marketing = driver.findElement(By.name("marketingCampaignId"));
		    
		    Select options3 = new Select(Marketing);
		    
		    options3.selectByIndex(6);
		    
		    
		    WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		    
		    Select options4 = new Select(State);
		    
		    options4.selectByValue("TX");
		    
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
