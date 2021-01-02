package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.policy.pages.HomePage;
import com.policy.pages.LoginPage;

import basePage.BasePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

//@Listeners(ListernerTest.class)

public class LoginStepDefinition{

	private static WebDriver driver;
	private LoginPage login;
	private HomePage home;
	 
	 
	 @Before
	 public void setUp() {
		 
	 }
		 @Given("^the user is on the policy center Login Page$")
		 public void the_user_is_on_the_policy_center_Login_Page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://cbp-nonprod-uat.cloud.aioinissaydowa.eu/pc/PolicyCenter.do");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 		 		 			 
	/* @After
	 public void tearDown() {
		 driver.close();
		 driver.quit();
	 }*/
	 			 
		 
		 
		 
		 
	//	 throw new PendingException();
	    	 	 		 		 
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
					 
	 }
	 
	 
	 @When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void the_user_enters_and(String username, String password) throws Throwable {
		 Thread.sleep(5000);
		 login = new LoginPage(driver);
		 login.login(username, password);
	
		 	  
	 }
	
	 @When("^the user clicks on login button$")
	 public void the_user_clicks_on_login_button() throws Throwable {
		 login.clickLoginBtn();	 
	//	 String actualTitle = BasePage.getPageTitle();
	//	 Assert.assertEquals("[Dev mode - 9.0.5.336] Guidewire PolicyCenter", actualTitle);	
	//	 throw new PendingException();
	     
	 }
	 

	 @When("^the home page is displayed$")
	 public void the_home_page_is_displayed() throws Throwable {
		     home = new HomePage(driver);
		     
	//		String homePageTitle = HomePage.verifyHomePageTitle();
	//		Thread.sleep(5000);
	//		Assert.assertEquals("[Dev mode - 9.0.5.336] Guidewire PolicyCenter", homePageTitle);	
	//		throw new PendingException();
	 }
 
	 
	 @When("^the user clciks on the settings icon$")
	 public void the_user_clciks_on_the_settings_icon() throws Throwable {
	     
     	 home = new HomePage(driver);
		 home.Sett();		
	//	 throw new PendingException();
		 
	 }

	 
	 @When("^the user click on logout$")
	 public void the_user_click_on_logout() throws Throwable {
		 home.logOut();
	 //  throw new PendingException();
	 }
	 	 
	 @When("^the login screen is displayed$")
	 public void the_login_screen_is_displayed() throws Throwable {
	//	 String actualTitle = BasePage.getPageTitle();
	//	 Assert.assertEquals("[Dev mode - 9.0.5.336] Guidewire PolicyCenter", actualTitle);	
	//	 throw new PendingException();
	 }
	 		 		 
	 @Then("^close the browser$")
	 public void close_the_browser() throws Throwable {
		 driver.close();
		 driver.quit();
	 //    throw new PendingException();
	 }
 	 		 
		 
 }


	 
	 
	 	 

	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	


	 
	
	
	 
	
	


