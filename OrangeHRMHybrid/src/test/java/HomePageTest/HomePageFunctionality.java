package HomePageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

import junit.framework.Assert;

public class HomePageFunctionality extends BaseClass{
HomePage homepage;

	@BeforeTest
	public void setup()
	{
		BaseClass.initialisation();
	}
	@Test(priority=1)
	public void validateHomePageLogo()
	{
		LoginPage loginpage=new LoginPage();
		loginpage.ValidateLoginPage(prop.getProperty("UserName"),prop.getProperty("Password"));
		homepage = new HomePage();
		homepage.validateHomePageLogo();
	}
	@Test(priority=2)
	public void validatehomepagetitle()
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals("OrangeHRM", actualTitle);
	}
	@Test(priority=3)
	public void validatehomepageUrl()
	{
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(true, actualUrl.contains("dashboard"));
	}
	@Test(priority=4)
	public void enterPIM()
	{
		homepage.clickPIMlink();
	}
	@Test(priority=5)
	public void enterAdmin()
	{
		homepage.clickadminlink();
	}
	@Test(priority=6)
	public void enterMyInfo()
	{
		homepage.clickMyInfolink();
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
