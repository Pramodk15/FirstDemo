package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.ActionsClass;
import com.UtilsLayer.Dropdown;



public class AdminPage extends BaseClass {
	ActionsClass ac;
	@FindBy(id="btnAdd")
	WebElement addbtn;

	@FindBy(id="systemUser_userType")
	WebElement userRole;

	@FindBy(id="systemUser_employeeName_empName")
	WebElement empName;

	@FindBy(id="systemUser_userName")
	WebElement userName;

	@FindBy(id="systemUser_status")
	WebElement status;

	@FindBy(id="systemUser_password")
	WebElement password;

	@FindBy(id="systemUser_confirmPassword")
	WebElement Confpass;
	
	@FindBy(name="btnSave")
	WebElement savebtn;
	
	@FindBy(id="searchBtn")
	WebElement searchbtn;
	
	@FindBy(name="searchSystemUser[userName]")
	WebElement searchUserName;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement searchempName;
	
	@FindBy(xpath="//table[@id='resultTable']//td/input")
	WebElement selectchkbox;
	
	@FindBy(id="btnDelete")
	WebElement deletebtn;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement okbtn;
	
	public AdminPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void createNewAdmin()
	{
		addbtn.click();
		userRole.click();
		Dropdown.selectByVisibleText(userRole, "ESS");
		empName.sendKeys("Aaliyah Haq");
		userName.sendKeys("pramodk22288");
		Dropdown.selectByVisibleText(status, "Enabled");
		password.sendKeys("mnbvcxzzxcvbnm");
		Confpass.sendKeys("mnbvcxzzxcvbnm");
		ac=new ActionsClass();
		ac.clickonElement(savebtn);
		//driver.findElement(By.id("btnSave")).click();
		
	}
	public void searchByUserName()
	{
		searchUserName.sendKeys("pramodk22288");
		searchbtn.click();
		
	}
	public void searchByEmpName()
	{
		searchempName.sendKeys("Aaliyah Haq");
		searchbtn.click();
	}
	public void deleteNewlyCreatedAdmin()
	{
		ac.clickonElement(selectchkbox);
		deletebtn.click();
		okbtn.click();
	}
}
