package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);	
		
	}
	
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement  loginButton;
	
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement userID;
	
	@FindBy(xpath="//*[@name='Password']")
	WebElement password;
	
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement loginContinue;

	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void logInCred(String id,String pass) {
		loginButton.click();
		userID.sendKeys(id);
		password.sendKeys(pass);	
	}
	
	public void logIn() {
	loginContinue.click();
		}
	
public String accountVerify() {
	String acc=account.getText();
	return acc;
}
	
	

}
