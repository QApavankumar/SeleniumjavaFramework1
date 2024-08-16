package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class TC_LogINTest_003 extends BaseClass{
	
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	
	}
	@Test(priority=2)
	public void test2() {
		LoginPage lp=new LoginPage(driver);
		
		lp.logInCred("pavanbadugu11@gmail.com","pavan@111");
		
	lp.logIn();	
		
		
	}
	
	
	@Test(priority=3)
public void test3() {	
	LoginPage lp=new LoginPage(driver);
	
	String actualUserId=lp.accountVerify();
	
	
	System.out.println("actual user id ="+actualUserId);
	String expectUserId="pavanbadugu11@gmail.com";
	System.out.println("expect user id ="+expectUserId);
	
	
	
	Assert.assertEquals(actualUserId, expectUserId);
	
}
	
	
	
	
}
