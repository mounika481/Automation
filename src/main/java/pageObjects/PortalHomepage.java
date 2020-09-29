package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomepage {
	public WebDriver driver;
By console=By.xpath("//button[text()='NO THANKS']");
	
	public PortalHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement consoledisplay()
	{
		return driver.findElement(console);
	}

}
