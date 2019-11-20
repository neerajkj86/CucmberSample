package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;



public class Steps 
{
	
	
	public WebDriver driver;
	
	public LoginPage lp;


	
@Given("^user launch chrome browser$")
public void user_launch_chrome_browser() {
   
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	lp = new LoginPage(driver);
	
	
}

@When("^user opens  URL \"([^\"]*)\"$")
public void user_opens_URL(String URL) {
	driver.get(URL);
	
}

@When("^user enter Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void user_enter_Email_as_and_Password_as(String email, String password) {
	lp.SetUserNamePassword(email, password);
}

@When("^click on Login$")
public void click_on_Login() throws Throwable {
    lp.clickLogin();
    Thread.sleep(3000);
}

@Then("^Page Title should be \"([^\"]*)\"$")
public void page_Title_should_be(String title) {
	
		
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			
			driver.close();
			Assert.assertTrue(false);
		}
			else {
				Assert.assertEquals(title, driver.getTitle());
			}
		}
    


@When("^user click on log out link$")
public void user_click_on_log_out_link() throws Throwable {
	lp.clickLogout();
	   
	   Thread.sleep(3000);  
}

@Then("^close the browser$")
public void close_the_browser() {
    driver.close();
}
}