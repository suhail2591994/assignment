package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Dashboard")) {
			System.out.println("true");
			
		} else {
            System.out.println("false");
		}
		
		driver.navigate().back();
		
		boolean displayed = driver.findElement(By.xpath("//span[text()='Disabled']")).isDisplayed();
		System.out.println(displayed);
		
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println(location);
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(size);
		
		driver.close();
	}
	
}
