package week2.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//waittime
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter Firstname
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		
		//Enter lastname
		driver.findElement(By.name("lastname")).sendKeys("1234567");
		
		//Enter Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("9655250294");
		
		//Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Ram1234567");
		
		//Enter dob
		WebElement day1 = driver.findElement(By.id("day"));
		Select day2 = new Select(day1);
		day2.selectByValue("15");
		
		WebElement month1 = driver.findElement(By.id("month"));
		Select month2 = new Select(month1);
		month2.selectByVisibleText("Jan");
		
		WebElement year1 = driver.findElement(By.id("year"));
		Select year2 = new Select(year1);
		year2.selectByValue("2023");
		
		//Enter gender
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//closing window
		driver.close();
	
	
	}

}