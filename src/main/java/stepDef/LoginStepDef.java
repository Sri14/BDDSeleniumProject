package stepDef;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CompanyPage;
import utils.TestBase;

public class LoginStepDef extends TestBase{

	CompanyPage companyPage;
	
	
	
	@Given("^user is on free crm login page and logs in$")
	public void user_is_on_free_crm_login_page_and_logs_in() throws Throwable {
		
		LoginStepDef.initialization();
	}


	@Then("^user is able to login to homepage$")
	public void user_is_able_to_login_to_homepage() throws Throwable {
			String title = driver.getTitle();
			Assert.assertEquals(title, "Cogmento CRM");
			
	}
	
	@Then("^I click on companies tab$")
	public void i_click_on_companies_tab() throws Throwable {
			companyPage = new CompanyPage();
			companyPage.CompanyButton();
	}

	@Then("^I create a new company$")
	public void i_create_a_new_company() throws Throwable {
		companyPage = new CompanyPage();
		companyPage.NewButton();
		companyPage.NewCompanyDeatils();
		driver.quit();
	}


}
