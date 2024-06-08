package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //Basic Xpath - Partial Match - //tagName[contains(text(),'Partial text in my DOM')]
		driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).click();
		
		
		//Basic Xpath - Text Based - //tagName[text()='text value in DOM']
        driver.findElement(By.xpath("//label[text()='Chennai']")).click();
      		
        //Basic Xpath- Partial Match - //tagName[contains(@attribute,'Partial value of the attribute')]
        driver.findElement(By.xpath("(//div[contains(@class,'box ui-widget')])[16]")).click();
        
        driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).click();
        
        boolean displayed = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isDisplayed();
        System.out.println(displayed);
        
        boolean enabled = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
        System.out.println(enabled);
        
		//Basic Xpath - Text Based - //tagName[text()='text value in DOM']
        boolean selected = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
        System.out.println(selected);

        
        
        
		
	}

}
