package Pom_hy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genari_hy.Base_page;

public class Login_fb extends Base_page{
	@FindBy(name="email")
	private WebElement unField;
	@FindBy(name="pass")
	private WebElement pwdField;
	@FindBy(name="login")
	private WebElement loginBtn;
	public Login_fb(WebDriver driver)
	{
		super(driver);
	}
	public void PassUN(String un)
	{
		unField.sendKeys(un);
	}
	public void Passpwd(String pwd)
	{
		pwdField.sendKeys(pwd);
	}
	public void btn()
	{
		loginBtn.click();
	}
	

}
