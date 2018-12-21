
package WebApplication;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoggingPage;
import resources.base;

class HomePageTest extends base

{
	@BeforeTest
	public void urlcode() throws IOException
	{
		  driver = initializeDriver();
		 
	}

	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,String password,String text) throws IOException, InterruptedException
	{
		
		
		 String url = prop.getProperty("url");
		 driver.get(url);
		 driver.manage().window().maximize();
		 LandingPage lo = new LandingPage(driver);
		
		
		lo.getLogin().click();
		LoggingPage log = new LoggingPage(driver);
		log.getEmail().sendKeys(username);
		log.getpassword().sendKeys(password);
		log.getloginbutton().click();
		System.out.println(text);
		
	
	}
	
@DataProvider
public Object[][] getdata()
{
		
		Object[][] ob1 =new Object[2][3];
		
	    ob1[0][0]= "vinay.tiwqri@gashsdg.com";
		ob1[0][1]="sjbiui1321";
		ob1[0][2]="valid";
		ob1[1][0]="invalidid@cjhclk.com";
		ob1[1][1]="invalidid@cjhclk.com";
		ob1[1][2]="invalid";
		return ob1;
}

@AfterTest
public void getclose()
{
	driver.close();
}


}




