package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hmw1{

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.techfios.com/billing/?ng-admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Personal Account");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Checking");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("55000.00");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("0555-679-000");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("Gretchen");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("777-777-7777");
		driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("https://www.examplebank.com");
		
		Thread.sleep(3000);
		
	}
		@After
		public void tearDown() {
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
