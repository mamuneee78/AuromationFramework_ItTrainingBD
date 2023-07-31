package UI_CG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_PopUp_Handling extends BaseDriverNew {

	String url = "https://demoqa.com/alerts";

	@Test
	public void alertsTest() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);

		//...........................accept alert method.....................//
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));

		alertButton.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		//...........................dismiss and get text alert method.....................//
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));

		confirmAlert.click();
		Thread.sleep(2000);

		Alert cnfrmAlert = driver.switchTo().alert();
		cnfrmAlert.dismiss();
		Thread.sleep(2000);

		WebElement confirmResult = driver.findElement(By.id("confirmResult"));

		System.out.println(confirmResult.getText());

		
		//...........................Enter sendKeys and get text alert method.....................//
		WebElement promtAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));

		promtAlert.click();
		Thread.sleep(1000);

		Alert pmtAlert = driver.switchTo().alert();
		pmtAlert.sendKeys("Thanks to helping me");
		Thread.sleep(1000);
		pmtAlert.accept();
		Thread.sleep(1000);
		WebElement pmtResult = driver.findElement(By.id("promptResult"));

		System.out.println(pmtResult.getText());
		Thread.sleep(1000);
		driver.close();

	}

}
