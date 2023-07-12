package UI_CG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RoughClass extends BaseDriverNew {
	@Test
	public void loggIn() throws InterruptedException {
		
		driver.get("https://testcrm.mimebd.com/web#id=&view_type=form&model=stock.picking&menu_id=475&action=582");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.reza@cg-bd.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Log in')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(.,'Add an item')]")).click();
		Thread.sleep(1000);
		WebElement product = driver.findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[5]"));
		product.sendKeys("Product_08");
		product.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement dem = driver.findElement(By.xpath("//input[@name='product_uom_qty']"));
		dem.click();
		dem.sendKeys("1");
		
	}

}
