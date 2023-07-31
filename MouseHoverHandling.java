package UI_CG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverHandling extends BaseDriverNew {
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void mouseHoverTest() throws InterruptedException {
		
		
		driver.manage().window().maximize();
		driver.get(url);
		
		Actions action = new Actions(driver);
		
		WebElement HomeandLifestyle = driver.findElement(By.xpath("//span[contains(.,'Home & Lifestyle')]"));
		
		action.moveToElement(HomeandLifestyle).perform();
		
		Thread.sleep(2000);
		
		WebElement Coockware = driver.findElement(By.xpath("(//span[contains(.,'Cookware')])[1]"));
		
		action.moveToElement(Coockware).perform();
		
		Thread.sleep(2000);
		
		WebElement stoveKettles = driver.findElement(By.xpath("//span[contains(.,'Griddle & Grills')]"));
		stoveKettles.click();
		
		//action.moveToElement(stoveKettles).perform();
		
		
		Thread.sleep(2000);
		
		driver.close();

			
	}

}
