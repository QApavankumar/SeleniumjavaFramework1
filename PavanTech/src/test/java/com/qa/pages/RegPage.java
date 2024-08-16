package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class RegPage extends BaseClass {
	
	
	public RegPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (xpath="//a[@class='ico-register']" )
	WebElement regButton;
	
	
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement firstName;
	
	
	@FindBy(xpath="//*[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement email;
	
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='ConfirmPassword']")
	WebElement confirmpassword;
	
	
	@FindBy(xpath="//*[@id='register-button']")
	WebElement confirmbutton;
	
	@FindBy(xpath="//*[@id='gender-male']")
	WebElement radio;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	

	public void register(String first,String last,String mail) {
		regButton.click();
		radio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		email.sendKeys(mail);
		}
	
	
	public void userPassword(String pass,String confirmPass) {
		
		password.sendKeys(pass);
		confirmpassword.sendKeys(confirmPass);		
	}
	
	
	
	
	public void register() {
		confirmbutton.click();
	}
	
	public String user() {
		
	String acc=	account.getText();
	return acc;
		
		
		
		
		
	}
	

	
}
