package Runner_hy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_hy.Login_fb;
import genari_hy.Before;

public class Runner_fb extends Before{
	@Test(dataProvider = "testData")
	public void test2(String un, String pwd) throws InterruptedException
	{
		Login_fb p1= new Login_fb(driver);
		p1.PassUN(un);
		p1.Passpwd(pwd);
		Thread.sleep(1000);
		p1.btn();
		Assert.fail();	
	}
	@DataProvider(name="testData")
	public Object[][] createData1() {
		 return new Object[][] {
		   { "Asha", "123456" },
		   { "Kiran", "123456"},  
		 };
}
}
