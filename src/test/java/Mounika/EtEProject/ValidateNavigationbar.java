package Mounika.EtEProject;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationbar extends Base{
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
	public void navbarValidation() throws IOException
	{
		LandingPage l= new LandingPage(driver);
		Assert.assertTrue(l.getnavigationbar().isDisplayed());
		log.info("validated nav bar");
	}
	@AfterTest
	public void browserterminatin()
	{
		driver.close();
	}

}
