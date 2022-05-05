package LoginPageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.UtilsLayer.UtilsClass;

public class LoginTest extends BaseClass {
	LoginPage loginpage;
	@BeforeTest
	public void setup()
	{
		BaseClass.initialisation();
	}
	@Test(priority=1)
	public void validateLogo()
	{
		loginpage=new LoginPage();
		loginpage.ValidateLogo();
	}
	@Test(priority=2)
	public void logintest()
	{
		loginpage.ValidateLoginPage(prop.getProperty("UserName"),prop.getProperty("Password"));
		UtilsClass.takeScreenshot();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
