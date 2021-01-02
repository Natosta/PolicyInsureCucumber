package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.policy.pages.AccountPage;
import com.policy.pages.CreateAccountPage;
import com.policy.pages.DriversPage;
import com.policy.pages.EnterAccountInfoPage;
import com.policy.pages.HomePage;
import com.policy.pages.LoginPage;
import com.policy.pages.NewSubmissionsPage;
import com.policy.pages.PMVehiclesPage;
import com.policy.pages.PaymentPage;
import com.policy.pages.PolicyInfoPage;
import com.policy.pages.PolicyReviewPage;
import com.policy.pages.QuotePage;
import com.policy.pages.RiskAnalysisPage;
import com.policy.pages.SubmissionBoundPage;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@Listeners(ListernerTest.class)
public class QuoteSummaryStepDefinition {

	private static WebDriver driver;
	private LoginPage login;
	private HomePage home;
	private EnterAccountInfoPage enter;
	private AccountPage Act;
	 
	 @Before
	 public void setUp() {
		 
	 }
	 
	     @Given("^i am on the policy centre login page$")
	     public void i_am_on_the_policy_centre_login_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://cbp-nonprod-qa.cloud.aioinissaydowa.eu/pc/PolicyCenter.do");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	
	 }
		 
         @When("^they enter the user \"([^\"]*)\" and \"([^\"]*)\"$")
         public void they_enter_the_user_and(String username, String password) throws Throwable {
         login = new LoginPage(driver);
         login.login(username, password);
         
}

         @When("^they click on the login button$")
         public void they_click_on_the_login_button() throws Throwable {
         login.clickLoginBtn();
         
}
         
         @When("^they click on Actions$")
         public void they_click_on_Actions() throws Throwable {
         home = new HomePage(driver);
         Thread.sleep(5000);
         home.ClickActt();
         home.ClickNew();
         }
        	        	 
         @When("^they complete all fields$")
         public void they_complete_all_fields() throws Throwable {
         EnterAccountInfoPage Info = new EnterAccountInfoPage(driver);
         Thread.sleep(5000);
         Info.First();
         Info.Second();
         Info.PostCode();     	   
    	 }     
   
         @When("^they click on the search button$")
         public void they_click_on_the_search_button() throws Throwable {
	     EnterAccountInfoPage Info = new EnterAccountInfoPage(driver);
	     Info.Src();
	     Thread.sleep(2000);
	     Info.CreateUser();                
          }
          
         @When("^they click on person$")
         public void they_click_on_person() throws Throwable {
	     EnterAccountInfoPage Info = new EnterAccountInfoPage(driver);
	     Thread.sleep(2000);
         // Info.selectValue("Person");
         Info.ClickPerson();

}

        @When("^they set the primary phone to Mobile$")
        public void they_set_the_primary_phone_to_Mobile() throws Throwable {
	    CreateAccountPage Create = new CreateAccountPage(driver);
	      
	    Thread.sleep(4000);
	    Create.DropType();
	    Thread.sleep(3000);
	    Create.TakeBrand();
	    Create.PPhone();
	    Create.Sphone();
	    Thread.sleep(3000);
	    Create.Mob();
	    Create.EnterEmail();
	  //  Create.Pcode();
	    Thread.sleep(2000);
	    Create.ClickSearch1();
	    Thread.sleep(5000);
	    Create.AddressDropDown();
	    Thread.sleep(5000);
	    Create.AddressDropDownList();
	    Thread.sleep(3000);
	    Create.GarageDDList();
	    Create.SelectCorrespondence();
	    
	    
	     
	    AccountPage Submmit = new AccountPage(driver);
	    Thread.sleep(3000);
	    Submmit.CreateAccount();
	    Thread.sleep(2000);
	    Submmit.Action();
	        
	    
	    NewSubmissionsPage Page = new NewSubmissionsPage(driver);
	    Thread.sleep(2000);
	    Page.First();
	    
	    
	    PolicyInfoPage Policy = new PolicyInfoPage(driver);
	    Thread.sleep(2000);
	    Policy.ProdSelect();
	    Thread.sleep(4000);
	    Policy.HearAboutDD();	    
	    Thread.sleep(3000);
	    Policy.SelectAboutUs();
	    Policy.EnterDate();
	    Thread.sleep(4000);
	    Policy.Enter();
	    Policy.Proceed();
	
	    
	    DriversPage Driver = new DriversPage(driver);
	    Thread.sleep(3000);
	    Driver.AddDriverDDW();
	    Driver.AddExDriver();
	    Thread.sleep(4000);
	    Driver.SelectDriver();
	    Thread.sleep(3000);
	    Driver.TitleDropDw();
	    Driver.SelectTitle();
	    Driver.EnterDob();
	    Driver.SelectGenderType();
	    Driver.GenderTy(); 
	    Driver.Job();
	    Driver.JobType();
	    Driver.MaritalStatus();
	    Driver.SelectMarried();
	    Driver.Residency();
	    Thread.sleep(2000);
	    Driver.HomeOwnerShip();
	    Driver.NextTab();
	    Thread.sleep(1000);
	    Driver.Licence();
	    Driver.UKLicence(); 
	    Thread.sleep(2000);
	    Driver.LicenceTerm();
	    Thread.sleep(2000);
	    Driver.AccessToOtherVehicles();
	    Driver.SltQualification();
	    Driver.AddQualification();
	    Driver.ConditionType();
	    Thread.sleep(4000);
	    Driver.NoCondition();
	  // Driver.SelectCondition();
	    Driver.TypeOfMotorOffence();
	    Driver.Insurance();
	    Driver.Claims();
	    Thread.sleep(1000);
	    Driver.Convictions();
	    Thread.sleep(1000);
	    Driver.PM();
	      	    
	    PMVehiclesPage PM = new PMVehiclesPage(driver);
	    Thread.sleep(3000);
	    PM.AddVehicles();
	    Thread.sleep(2000);
	    PM.EnterVehicleReg();
	    Thread.sleep(3000);
	    PM.SecurityDevice();
	    Thread.sleep(1000);
	    PM.SecurityDevice();
	    PM.AddDevice();
	    PM.SecuTracker();
	    PM.VehicleValue();
	    PM.Modified();
	    Thread.sleep(1000);
	    PM.DayParking();
	    PM.SelectDayPark();
	    PM.NightPark();
	    PM.NightParking();
	    Thread.sleep(3000);
	    PM.AddDriversToVH();
	    Thread.sleep(3000);
	    PM.ChooseDriver();
	    Thread.sleep(6000);
	    Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.SPACE);	    
	    actions.build().perform();	        
	    
	 //   PM.DriverCheckBox();
	    Thread.sleep(2000);
	    PM.YearBought();
	    PM.MonthBought();
	    PM.YearBoughtCar();
	    PM.HowDoUseYourCar();
	    PM.TellUs();
	    PM.CarOwner();
	    PM.Keeper();
	    PM.DrivingHand();
	    PM.Imported();
	    PM.Seats();
	    PM.ProdMiles();
	    PM.SelectMiles();
	    PM.DriverMiles();
	    PM.VolExcess();
	    Thread.sleep(1000);
	    PM.EnterVolAmount();
	    PM.NCD();
	    PM.AddNCD(); 	  
	    Thread.sleep(4000);
	    PM.RiskCheck();
	  
	    RiskAnalysisPage Risk = new RiskAnalysisPage(driver);
	    Thread.sleep(4000);
	    Risk.GetT();
	    
	    PolicyReviewPage Review = new PolicyReviewPage(driver);
	    Thread.sleep(5000);
	    Review.Quote();
	     
	    QuotePage Price  = new QuotePage(driver);
	    Thread.sleep(4000);
	    Price.PayPage();
	    
	    PaymentPage Pay  = new PaymentPage(driver);
	    Thread.sleep(3000);
	    Pay.CardDp();
	    Thread.sleep(4000);
	    Pay.CardType();
	    Thread.sleep(2000);
	    Pay.CardCheck();
	    Thread.sleep(2000);
	    Pay.ProceedPay();
	    Thread.sleep(2000);
	    driver.switchTo().frame("inet-menu-tree-frame");
	   // driver.findElement(By.tagName("Card Number")).sendKeys("4929 0000 0000 6");
	    Pay.CardNumber();
	    Thread.sleep(5000);
	    Pay.StartMontDropDown();
	    Pay.StartMont();
	    Pay.YearDropDown();
	    Pay.ExYear();
	    Pay.SecurityCode();
	    Pay.Purchase();
	    driver.switchTo().parentFrame();
	    SubmissionBoundPage Sub = new SubmissionBoundPage(driver);
	    Thread.sleep(10000);
	    Sub.Submission();
	    

        driver.switchTo().frame(driver.findElement(By.name("Card Number")));
      //  System.out.println(driver.findElement(By.xpath("//*[@id='table2']/tbody/tr/td[3]/font")).getText());
        driver.findElement(By.name("Card Number")).sendKeys("4929 0000 0000 6");
	   
	   
	   //   Thread.sleep(5000);
	  //    Price.GetQuote();
	    
	    
	 // Create.SelectAddFromList();
	 // Create.SelectCorrespondence();
       
	  //   Create.selectValue3("Insur The Box");
	   //  Create.BrandClear();
	   //  Create.BrandType();
	   //  Create.Cli();
	     
	     
	   //  Create.selectBrandType("Primary Phone Type : Insure The Box \"Primary Phone Type\"");
	    // Create.selectPrimaryPhone("Mobile");
	   //  Create.Branding(
	//     driver.findElement(by xpath = "//input[@name='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:PrimaryPhone']").cli
	     
	//     @FindBy(xpath = "//*[contains(text(), 'Best Choice')]")
	//     WebElement buttonBestChoice;
        
	    
  
}

         @When("^they enter the mobile phone number$")
         public void they_enter_the_mobile_phone_number() throws Throwable {
         // Write code here that turns the phrase above into concrete actions
         throw new PendingException();
}

        @When("^they click on the Update button$")
        public void they_click_on_the_Update_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
}

        @When("^they click on New Submission$")
        public void they_click_on_New_Submission() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
}

        @When("^they select a personal motor product$")
        public void they_select_a_personal_motor_product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
}

        @When("^they complete all required fields$")
        public void they_complete_all_required_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
}

        @When("^they click on the quote button$")
        public void they_click_on_the_quote_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
}

        @Then("^the quote summary page should be displayed$")
        public void the_quote_summary_page_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
        	throw new PendingException();
        	
       
}

}
		 
		 
		 