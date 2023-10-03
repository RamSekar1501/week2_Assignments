package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		
		//loading the Url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to maximize the window
		driver.manage().window().maximize();
		
		// Enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		// click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click on accounts
		driver.findElement(By.linkText("Accounts")).click();
				
		// create account
		driver.findElement(By.linkText("Create Account")).click();
		
		// passing account name "accountName"
		driver.findElement(By.id("accountName")).sendKeys("RamSekar");
		
		//passing the value to description box - "Description"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		
		// to fetch industry values from Account form
		
		WebElement industrylist = driver.findElement(By.name("industryEnumId"));
		Select dd_industry = new Select(industrylist);
		
		dd_industry.selectByVisibleText("Computer Software");
		
		
		//ownershipEnumId from Account form
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		
		Select dd_own = new Select(owner);
		
		dd_own.selectByVisibleText("S-Corporation");
		
		//source from Account form
		
		WebElement sourcedd = driver.findElement(By.name("dataSourceId"));
				
		Select dd_source = new Select(sourcedd);
				
		dd_source.selectByVisibleText("Employee");
		
		
		//Marketing Campaign from Account form
		
		WebElement camp = driver.findElement(By.name("marketingCampaignId"));
				
		Select dd_camp = new Select(camp);
				
		//dd_camp.selectByVisibleText("eCommerce Site Internal Campaign");
		
		dd_camp.selectByIndex(6);
		
		//state/province from Account form
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
						
		Select dd_state = new Select(state);
						
		//dd_state.selectByVisibleText("Texas");
		
		dd_state.selectByValue("TX");
//TX
		// click on create account smallSubmit submit
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.close();
		
	}
	}


