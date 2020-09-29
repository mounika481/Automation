package Mounika.EtEProject;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;


public class HomePage extends Base {
	public WebDriver driver;
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=InitializeDriver();
		//driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider="getdata")
	public void basePageNavigation(String Username, String password, String text) throws IOException
	{
		//driver=InitializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		
		l.getlogin().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(password);
		//System.out.println(text);
		lp.getlogin().click();
		
	}
	@AfterTest
	public void browsertermination()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="abc@gmail.com";
		data[0][1]="mou";
		data[0][2]="restricteddata";
		data[1][0]="mou@gmail.com";
		data[1][1]="xyz";
		data[1][2]="non-restricteddata";
		return data;
	}
}