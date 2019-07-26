package stepDefinitions;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Before Mobile hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation()
	{
		System.out.println("After Mobile hook");
	}
	
	@Before("@WebTest")
	public void beforewebvalidation()
	{
		System.out.println("Before Web hook");
	}
	
	@After("@WebTest")
	public void afterwebvalidation()
	{
		System.out.println("After Web hook");
	}
	
	@After("@SmokeTest")
	public void AfterRegressiontest()
	{
		driver.close();
	}
	@After("@RegressionTest")
	public void AfterSmoketest()
	{
		driver.close();
	}
}
