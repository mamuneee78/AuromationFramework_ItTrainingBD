package UI_CG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionHandle extends BaseDriverNew {
	
	String URL = "https://testcrm.mimebd.com/web/login";
	@Test
	public void testAssert() {
		driver.get(URL);
		driver.manage().window().maximize();
		
		String ExpectedResult = "MiMEww";
		String ActualResult = driver.getTitle();
		// Hard Assertion It will stop all the test if found any single issue
		//Assert.assertEquals(ActualResult,ExpectedResult );
		
		
		//softAsserttion   it will run all the test even the fail any test
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualResult, ExpectedResult);
		
		System.out.println("Pass");
		
		driver.close();
		soft.assertAll();       // It will show the error after complete whole test 
		
		
		
		
	}
	

}
