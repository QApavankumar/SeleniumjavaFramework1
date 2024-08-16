package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegPage;

public class TC_RegPage_002  extends BaseClass{
	@Test(priority =1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
		
		
	}
	@Test(priority =2)
public void test2() {
	RegPage rp=new RegPage(driver);
	rp.register("pavan","tech","pavanbadugu11@gmail.com");
	
	rp.userPassword("pavan@111", "pavan@111");
	rp.register();
	
}
	
	
	@Test(priority=3)
	public void testUserVerify() {
		RegPage rp=new RegPage(driver);
		String actualUser=rp.user();
		System.out.println("actual user is="+actualUser);
		
		String expectUser="pavanbadugu11@gmail.com";
		System.out.println("expected user is="+expectUser);
		
		Assert.assertEquals(actualUser, expectUser);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
