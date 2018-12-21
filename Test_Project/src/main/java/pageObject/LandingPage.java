package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
    WebDriver driver;
	
	By sigin= By.xpath("//span[contains(text(),'Login')]");
	By title =By.xpath("//*[@id=\"homepage\"]");
	By text = By.xpath("//h2[text()='Featured Courses']");
	
	public LandingPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(sigin);
	}
	
	public WebElement titleverified()
	{
		return driver.findElement(title);
	}
	public WebElement gttext()
	{
		return driver.findElement(text);
	}
	
	
}
