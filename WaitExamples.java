package UI_CG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WaitExamples extends BaseDriverNew {
	
	String URL = "https://testcrm.mimebd.com/web/login";
	@SuppressWarnings("deprecation")
	@Test
	public void tesWait() throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.reza@cg-bd.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Log in')]")).click();
		//Implicit wait 
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait not work after V3
		
		//Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement inventory = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Inventory')]")));
		inventory.click();
		
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
	}

}
