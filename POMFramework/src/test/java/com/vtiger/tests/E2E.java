package com.vtiger.tests;

import org.junit.*;

import com.vtiger.pages.homePage;
import com.vtiger.pages.leadPage;
import com.vtiger.pages.loginPage;

public class E2E extends baseTest {
	
	@BeforeClass
	public void launchStart()
	{
		launchApp();
	}
	
	 @Test
	 public void Testcase5_leadcreation()
	 {
		 loginPage lp = new loginPage(driver);
			lp.login("admin", "admin");
			homePage hp = new homePage(driver);	
			hp.clickNewLead();
			leadPage ldp = new leadPage(driver);	
			boolean val=ldp.createLead("Neha", "TCS");
			Assert.assertEquals(val, true);
			ldp.clickLogout();
	 }
	 
	 @AfterClass
		public void tierdown()
		{
			driver.quit();
		}

}
