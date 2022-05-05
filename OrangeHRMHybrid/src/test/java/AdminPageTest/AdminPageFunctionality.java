package AdminPageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.AdminPage;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

import junit.framework.Assert;

public class AdminPageFunctionality extends BaseClass {
LoginPage loginpage;
AdminPage adminpage;
HomePage homepage;
	@BeforeTest
	public void setup()
	{
		BaseClass.initialisation();
		loginpage=new LoginPage();
		homepage=new HomePage();
		loginpage.ValidateLoginPage(prop.getProperty("UserName"),prop.getProperty("Password"));
		homepage.validateHomePageLogo();
		homepage.clickadminlink();
	}
	@Test(priority=1)
	public void validateAdminPage()
	{
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(true, actualUrl.contains("admin"));
	}
	@Test(priority=2)
	public void createNewUser()
	{
		adminpage=new AdminPage();
		adminpage.createNewAdmin();
		adminpage.searchByUserName();
	}
//	@Test(priority=3)
//	public void searchNewlyCreatedUser()
//	{
//		adminpage.searchByUserName();
//	}
	@Test(priority=4)
	public void deleteNewlyCreatedUser()
	{
		adminpage.deleteNewlyCreatedAdmin();
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
