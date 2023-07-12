package UI_CG;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandling extends BaseDriverNew {
	
	String  url1 = "https://testcrm.mimebd.com/web/login";
	String  url2 = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void tabHandle() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url1);
		String originalTab = driver.getWindowHandle();
		Thread.sleep(3000);
	
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    String secondTab = driver.getWindowHandle();
	    driver.get(url2);
		driver.switchTo().window(originalTab);
		Thread.sleep(4000);
		driver.switchTo().window(secondTab);
	    Thread.sleep(3000);
	    
	    driver.close();
	    Thread.sleep(2000);
	    driver.quit();
	    
	
	
	
	}
	

}
