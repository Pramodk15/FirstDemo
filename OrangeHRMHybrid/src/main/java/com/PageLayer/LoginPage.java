package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;


public class LoginPage extends BaseClass{
	@FindBy(xpath="//div[@id='divLogo']/img")
	WebElement logo;
	
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotLink;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	public void ValidateLogo()
	{
		System.out.println(logo.isDisplayed());
	}
	
	public void ValidateLoginPage(String UName,String PWord)
	{
		uname.sendKeys(UName);
		pass.sendKeys(PWord);
		login.click();
	}
	public void fotgotuserpass()
	{
		forgotLink.click();
	}
}
