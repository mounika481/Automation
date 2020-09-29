package Mounika.EtEProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=InitializeDriver();
		log.info("driver is initialised");
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void titleValidation() throws IOException
	{
		LandingPage l= new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		Assert.assertTrue(l.getnavigationbar().isDisplayed());

	}
	@AfterTest
	public void browserterminatin()
	{
		driver.close();
	}
}
		
