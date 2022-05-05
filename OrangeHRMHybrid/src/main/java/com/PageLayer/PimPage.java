package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.Dropdown;



public class PimPage extends BaseClass{
	String empId;
	String Date="1";
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmp;
	
	@FindBy(id="firstName")
	WebElement fname;
	
	@FindBy(id="middleName")
	WebElement mname;
	
	@FindBy(id="lastName")
	WebElement lname;
	
	@FindBy(name="employeeId")
	 WebElement empid;
	
	@FindBy(id="btnSave")
	WebElement saveOrEditbtn;
	
	@FindBy(id="personal_txtLicenNo")
	WebElement drivingLicNo;
	
	@FindBy(className="ui-datepicker-year")
	WebElement year;
	
	@FindBy(className="ui-datepicker-month")
	WebElement month;
	
	By date=By.xpath("//a[text()='"+Date+"']");
	
	
	@FindBy(id="personal_txtLicExpDate")
	WebElement LicExpDate;

	@FindBy(id="personal_cmbMarital")
	WebElement maritalStatus;
	
	@FindBy(id="personal_DOB")
	WebElement dob;
	
	@FindBy(id="personal_cmbNation")
	WebElement nation;

	@FindBy(id="personal_txtNICNo")
	WebElement SSNNo;

	@FindBy(id="personal_txtSINNo")
	WebElement SINNo;

	@FindBy(id="personal_optGender_1")
	WebElement gender;

	@FindBy(id="personal_chkSmokeFlag")
	WebElement smoke;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement empList;
	
	@FindBy(id="empsearch_id")
	WebElement empsearchid;
	
	@FindBy(id="searchBtn")
	WebElement searchbtn;
	
	@FindBy(xpath="//table[@id='resultTable']//td/input[1]")
	WebElement selectChkBox;
	
	@FindBy(id="btnDelete")
	WebElement deletebtn;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement okbutton;
	
	
	
	public PimPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void createNewEmp(String Fname,String Mname,String Lname) {
		addEmp.click();
		fname.sendKeys(Fname);
		mname.sendKeys(Mname);
		lname.sendKeys(Lname);
		empId=empid.getAttribute("value");
		System.out.println(empId);
		saveOrEditbtn.click();
		saveOrEditbtn.click();
		
		drivingLicNo.sendKeys("12546258");
		LicExpDate.click();
		Dropdown.selectByVisibleText(year, "2025");
		Dropdown.selectByVisibleText(month, "Aug");
		driver.findElement(date).click();
		
		SSNNo.sendKeys("22164546");
		SINNo.sendKeys("5684651354");
		gender.click();
		maritalStatus.click();
		Dropdown.selectByVisibleText(maritalStatus, "Married");
		nation.click();
		Dropdown.selectByVisibleText(nation, "Indian");
		smoke.click();
		saveOrEditbtn.click();		
	}
	
	public void searchAndDeleteEmp() throws InterruptedException
	{
		empList.click();
		empsearchid.sendKeys(empId);
		searchbtn.click();
		Thread.sleep(2000);
		selectChkBox.click();
		deletebtn.click();
		Thread.sleep(2000);
		okbutton.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
}
