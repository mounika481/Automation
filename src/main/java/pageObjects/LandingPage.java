package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//div[@class='text-center']/h2");
	By navbar=By.cssSelector("ul[class*='navbar-right']");
	By popup=By.xpath("//button[text()='NO THANKS']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getnavigationbar()
	{
		return driver.findElement(navbar);
	}
	public List<WebElement> getpopupsize()
	{
		return driver.findElements(popup);
	}
	public WebElement getpopup()
	{
		return driver.findElement(popup);
	}
}
