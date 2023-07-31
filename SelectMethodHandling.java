package UI_CG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandling extends BaseDriverNew {

	String url = "https://www.amazon.com/";
	
	@Test
	public void selectTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement menuOptions = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(menuOptions);
		
		//selectByIndex
		select.selectByIndex(3);
		Thread.sleep(5000);
		
	
}
}