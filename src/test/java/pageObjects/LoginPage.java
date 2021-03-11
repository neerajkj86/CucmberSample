package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//added
public class LoginPage 
{
	
	public WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	
	@FindBy(id ="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;
	

	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;

	
	public void SetUserNamePassword(String uName,String pwd)
	{
		txtEmail.clear();
		txtPassword.clear();
		txtEmail.sendKeys(uName);
		txtPassword.sendKeys(pwd);
		
		
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
}
