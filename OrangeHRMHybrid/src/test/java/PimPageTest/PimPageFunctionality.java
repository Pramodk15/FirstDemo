package PimPageTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;
import com.PageLayer.PimPage;
import com.UtilsLayer.UtilsClass;

import junit.framework.Assert;

public class PimPageFunctionality extends BaseClass {
	PimPage pimpage;
	@BeforeTest
	public void setup()
	{
		BaseClass.initialisation();
		LoginPage loginpage=new LoginPage();
		loginpage.ValidateLoginPage(prop.getProperty("UserName"),prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void validatePIMPageUrl()
	{
		
		HomePage homepage=new HomePage();
		homepage.clickPIMlink();
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(true, actualUrl.contains("pim"));
	}
	@Test(priority=2)
	public void createnewPIMEmp()
	{
		 pimpage=new PimPage();
		pimpage.createNewEmp(prop.getProperty("FName"),prop.getProperty("MName"),prop.getProperty("LName"));
		UtilsClass.takeScreenshot();
	}
	@Test(priority=3)
	public void searchAndDelPIMEmp() throws InterruptedException
	{
		pimpage.searchAndDeleteEmp();
		UtilsClass.takeScreenshot();
	}
}
