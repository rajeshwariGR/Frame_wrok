package genari_hy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Before implements FrameWork_1 {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(gecko_key,gecko_value);
		
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@AfterMethod
public void closeAppln(ITestResult res)throws IOException
{
	if(ITestResult.FAILURE==res.getStatus())
	{
		Generic_scrn.getPhoto(driver);	
	}
	driver.close();

}
}



