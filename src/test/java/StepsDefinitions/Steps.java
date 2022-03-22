package StepsDefinitions;

import java.util.concurrent.TimeUnit;

public class Steps {
	private String url;
	public static WebDriver driver=null;
	
	@Given("User is on 'https://www.facebook.com'")
    public void gotoFacebook() {
		System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
    }
	
	@When("user clicks Create New Account$")
    public void user_clicks_on_create_account() throws Throwable {
        driver.findElement(By.linkText("Create New Account")).click();
    }
	
	@When("^user enters the following details$")
    public void user_enters_username_and_Password() throws Throwable {
		driver.findElement(By.id("u_5_b_U6")).sendKeys("John");
		driver.findElement(By.id("u_5_d_sc")).sendKeys("Doe");
    	driver.findElement(By.id("u_5_g_M/")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("1234");
        driver.findElement(By.id("day")).sendKeys("1234");
        driver.findElement(By.id("month")).sendKeys("1234");
        driver.findElement(By.id("year")).sendKeys("1234");
        driver.findElement(By.id("u_5_2_pj")).sendKeys("1");
    }
	
	@When("user clicks Sign Up$")
    public void user_clicks_on_signup() throws Throwable {
		driver.findElement(By.id("SubmitLogin")).click();   
    }
	
	@Then("^error message displayed with weak password$")
    public void error_message_is_displayed() throws Throwable {
    	String exp_message = "Your password must be at least 6 characters long. Please try another.";
    	Stringactual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();  
    }  
	
	@Given("user returns back on registration page")
    public void gotoRegisterPage() {
		System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
    }
}
