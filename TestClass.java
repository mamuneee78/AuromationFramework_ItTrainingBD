package UI_CG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass  extends BaseDriverNew
{
	
	@Test
	public void demoQAtest() throws InterruptedException {
		
		//System.setProperty("webdriber.chrome.driver", "E:\\Environment Software\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://testcrm.mimebd.com/web/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.reza@cg-bd.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Log in')]")).click();
		Thread.sleep(5000);
	}
		@Test
		public void inventory() throws InterruptedException {
		driver.get("https://testcrm.mimebd.com/web#action=108&active_id=channel_inbox");
		driver.findElement(By.xpath("(//span[@class='oe_menu_text'][contains(.,'Inventory')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oe_menu_text'][contains(.,'Assets without Famis')]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//table//tbody//tr[3]//td[3]")).click();
//		driver.findElement(By.xpath("//button[contains(@accesskey,'a')]")).click();
//		driver.findElement(By.xpath("//input[contains(@name,'famis_serial')]")).sendKeys("TestTag0005");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@accesskey='s'][contains(.,'Save')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(.,'My Assets Pool')]")).click();
//		
		
		
		
		
		
		
		}

	}


