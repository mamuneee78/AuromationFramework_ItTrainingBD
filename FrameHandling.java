package UI_CG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FrameHandling extends BaseDriverNew {
	
	String URL = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	//https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html
	@Test
	public void tesWait() throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(iframeNumber);
		
		driver.switchTo().frame("packageListFrame");
		
		WebElement selenium = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html'][contains(.,'org.openqa.selenium')]"));
		selenium.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
	
		driver.switchTo().frame("packageFrame");
		WebElement alert = driver.findElement(By.xpath("//span[contains(.,'Alert')]"));
		alert.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		WebElement accept = driver.findElement(By.xpath("//a[contains(.,'accept')]"));
		accept.click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
	}

}
