package Mounika.EtEProject;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class StreamsWebtables extends Base{

	@BeforeTest
	public void initialization() throws IOException
	{
		driver=InitializeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	/*@Test
	public void webtable()
	{
		//driver.findElement(By.xpath("//table[@id='product']/tbody/tr/th[2]")).click();
		List<WebElement> elementslist=driver.findElements(By.xpath("//tr/td[2]"));
		List<String> originallist=elementslist.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>price=elementslist.stream().filter(s->s.getText().contains("Appium (Selenium) - Mobile Automation Testing from Scratch")).
				map(s->getpriceofcourse(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
	}
	private static String getpriceofcourse(WebElement s) {
		// TODO Auto-generated method stub
		String Price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Price;
	}*/
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}