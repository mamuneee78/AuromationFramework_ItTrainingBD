package UI_CG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AssetTranfer extends BaseDriverNew{
	@Test(priority=0)
	public void loggIn() throws InterruptedException {
	
	driver.get("https://testcrm.mimebd.com/web/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.reza@cg-bd.com");
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
//	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.test");
//	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
	driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Log in')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[@class='oe_menu_text'][contains(.,'Inventory')])[1]")).click();
	
	//driver.findElement(By.xpath("(//span[contains(@class,'oe_menu_text')])[5]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(.,'Transfer')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@accesskey='c']")).click();
	Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void transfer() throws InterruptedException {
	WebElement a = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	a.click();
	a.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	WebElement b = driver.findElement(By.xpath("//div[@name='location_id']//input"));
	b.click();
	Thread.sleep(1000);
//	b.sendKeys("Uttora");
	b.sendKeys("Gulshan-2");
	Thread.sleep(1000);
	b.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	WebElement c = driver.findElement(By.xpath("//div[@name='location_dest_id']//input "));
	//c.click();
//	c.sendKeys("Gulshan-2");
	c.sendKeys("Uttora");
	Thread.sleep(1000);
	c.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(.,'Add an item')]")).click();
	Thread.sleep(1000);
	WebElement product = driver.findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[5]"));
	product.sendKeys("Product_08");
	Thread.sleep(3000);
	product.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	WebElement dem = driver.findElement(By.xpath("//input[@name='product_uom_qty']"));
	dem.click();
	dem.sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@accesskey='s'][contains(.,'Save')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//td[@class='o_data_cell o_list_button']//i")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody[@class='ui-sortable']//a")).click();
	Thread.sleep(1000);
	WebElement lot = driver.findElement(By.xpath("//div[@name='lot_id']//input"));
	lot.click();
	Thread.sleep(1000);
	lot.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'Confirm')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(.,'Send For Approval')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(@class,'name')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-menu='logout']")).click();
	Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void approverloggin() throws InterruptedException {
		
		driver.get("https://testcrm.mimebd.com/web/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamuneee78@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Log in')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='oe_menu_text'][contains(.,'Inventory')])[1]")).click();
		
		//driver.findElement(By.xpath("(//span[contains(@class,'oe_menu_text')])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(.,'Transfer')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[contains(.,'Relocation Approver')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-default oe_highlight'][contains(.,'Approve')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right oe_user_menu_placeholder']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-menu='logout'][contains(.,'Log out')]")).click();
		Thread.sleep(3000);
		//driver.close();
	
		

		
	}
	
	
	@Test(priority=4)
	public void astoreInchargeloggin() throws InterruptedException {
		
		driver.get("https://testcrm.mimebd.com/web/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.test");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
//		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mamun.reza@cg-bd.com");
//		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Log in')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='oe_menu_text'][contains(.,'Inventory')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(@class,'oe_menu_text')])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Transfer')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(.,'Store incharge Approver')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Receive')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(@class,'name')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-menu='logout']")).click();
		Thread.sleep(5000);
		driver.close();

		
	}
}
	
	



