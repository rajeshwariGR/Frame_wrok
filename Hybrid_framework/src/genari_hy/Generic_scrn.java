package genari_hy;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_scrn {
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String path="./phots/";
		Date d=new Date();
		String d1=d.toString();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dot = new File(path+d1+".jpge");
		FileHandler.copy(scr, dot);
}
}
