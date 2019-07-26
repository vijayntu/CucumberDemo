package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.CheckOutPage;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class stepDefinition extends Base{
	//public WebDriver driver; NOT needed since we extends the Base class
	CheckOutPage cp;
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("validate browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check browser is displayed$")
    public void check_browser_is_started() throws Throwable {
        System.out.println("Browser is displayed");
    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
    		System.out.println("navigate to url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	//code to login
		System.out.println("Logged in success");
    }
    
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	//code to login multi user
    			System.out.println(strArg1);
    			System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //code to validate home page
		System.out.println("validated home page");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
    	//code to validate cards
		System.out.println(arg1);
		System.out.println("And");
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^Verify selected (.+) items are displayed in check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
       
    	//Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    	//driver = Base.getDriver(); NOT needed since we extends the Base class
        cp=new CheckOutPage(driver);
        Assert.assertTrue(cp.getproductName().getText().contains(name));
    }

}