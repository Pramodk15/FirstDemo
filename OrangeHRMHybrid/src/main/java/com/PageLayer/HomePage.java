package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//div[@id='branding']/a/img")
	WebElement homepageLogo;
	
	@FindBy(xpath="//b[text()='Admin']")
	WebElement adminlink;

	@FindBy(xpath="//b[text()='PIM']")
	WebElement PIMlink;

	@FindBy(xpath="//b[text()='My Info']")
	WebElement MyInfolink;

	@FindBy(id="welcome")
	WebElement welcomesignout;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	public void validateHomePageLogo()
	{
		System.out.println(homepageLogo.isDisplayed());
	}
	public void clickadminlink()
	{
		adminlink.click();
	}
	public void clickPIMlink()
	{
		PIMlink.click();
	}
	public void clickMyInfolink()
	{
		MyInfolink.click();
	}
}
