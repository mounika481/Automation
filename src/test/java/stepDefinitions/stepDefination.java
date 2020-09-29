package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class stepDefination extends Base{
	@Given("^initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=InitializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String URL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(URL);
	}

	@Given("^Click on login link in home page to land on Secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_Secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l= new LandingPage(driver);
		if(l.getpopupsize().size()>0)
		{
			l.getpopup().click();
		}
		l.getlogin().click();
	}

	
	
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getlogin().click();
		System.out.println(lp.driver.getTitle());
    }

	@Then("^Verify that user is sucessfully logged in$")
	public void verify_that_user_is_sucessfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^Close browsers$")
    public void close_browsers() throws Throwable {
        driver.close();
    }


}