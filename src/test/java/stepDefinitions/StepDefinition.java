package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("^I an a Guest on the Signup page$")
	public void i_an_a_Guest_on_the_Signup_page() throws Throwable {

		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://start.ro.co/rory/vaginal-dryness");
		System.out.println(driver.getTitle());

	}

	@When("^I fill in the Email Field with a valid email address$")
	public void i_fill_in_the_Email_Field_with_a_valid_email_address() throws Throwable {

		//// input[@name='temporaryEmail'] email field

		driver.findElement(By.xpath("//input[@name='temporaryEmail']")).click();
		driver.findElement(By.xpath("//input[@name='temporaryEmail']")).clear();
		driver.findElement(By.xpath("//input[@name='temporaryEmail']")).sendKeys("1@1.com");

	}

	@When("^I fill in the FirstName Field with my \"([^\"]*)\"$")
	public void i_fill_in_the_FirstName_Field_with_my(String firstName) throws Throwable {
		// FName //input[@name='firstName']

		WebElement FirstN = driver.findElement(By.xpath("//input[@name='firstName']"));

		FirstN.click();

		FirstN.clear();

		FirstN.sendKeys(firstName);
	}

	@When("^I fill LastName Field  with my \"([^\"]*)\"$")
	public void i_fill_LastName_Field_with_my(String lastName) throws Throwable {

		driver.findElement(By.xpath("//input[@name='lastName']")).click();

		driver.findElement(By.xpath("//input[@name='lastName']")).clear();

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
	}

	@When("^I create a valid Password with my \"([^\"]*)\"$")
	public void i_create_a_valid_Password_with_my(String password) throws Throwable {
		driver.findElement(By.xpath(" //input[@name='password']")).sendKeys(password);
	}

	@When("^check CheckButton$")
	public void check_CheckButton() throws Throwable {
		driver.findElement(By.cssSelector("[class='checkbox-label']")).click();
	}

	@When("^click Start My Visit Button$")
	public void click_Start_My_Visit_Button() throws Throwable {
		driver.findElement(By.cssSelector("button[class*='button--primary']")).click();
	}

	@Then("^I am redirected to Start Page$")
	public void i_am_redirected_to_Start_Page() throws Throwable {
		System.out.println(" The Start Page url is " + driver.getCurrentUrl());
	}

	@Given("^I’m user on the Start Page$")
	public void i_m_user_on_the_Start_Page() throws Throwable {
		System.out.println(" The Start Page title is " + driver.getTitle());
	}

	@When("^I click Continue My Visit Button$")
	public void i_click_Continue_My_Visit_Button() throws Throwable {
		driver.findElement(By.xpath("//div[@class ='start']/button")).click();

	}

	@Then("^I am redirected to The Basic Page$")
	public void i_am_redirected_to_The_Basic_Page() throws Throwable {
		System.out.println(" Basic Page Title is" + driver.getTitle());

	}

	@Given("^I am user on the The Basic Page$")
	public void i_am_user_on_the_The_Basic_Page() throws Throwable {
		System.out.println(" Basic Page url is" + driver.getCurrentUrl());
	}

	@When("^I click Female Button$")
	public void i_click_Female_Button() throws Throwable {
		driver.findElement(By.xpath("//label[@* ='female']")).click();
	}

	@When("^fill the  Birthday Field with \"([^\"]*)\"$")
	public void fill_the_Birthday_Field_with(String birhday) throws Throwable {
		driver.findElement(By.cssSelector("input#dateOfBirth")).click();

		driver.findElement(By.cssSelector("input#dateOfBirth")).sendKeys(birhday);

	}

	@When("^fill the  Zip code Field with \"([^\"]*)\"$")
	public void fill_the_Zip_code_Field_with(String zipcode) throws Throwable {
		driver.findElement(By.cssSelector("input#zipcode")).click();
		driver.findElement(By.cssSelector("input#zipcode")).sendKeys(zipcode);

	}

	@When("^click Next Button$")
	public void click_Next_Button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Then("^I go to the Medical Questions Page$")
	public void i_go_to_the_Medical_Questions_Page() throws Throwable {

		System.out.println("The curent url is " + driver.getCurrentUrl());
	}

	@Given("^User on Medical Questions Page$")
	public void user_on_Medical_Questions_Page() throws Throwable {
		System.out.println("The Medical Questions Page Title is " + driver.getTitle());

	}

	@When("^I click Continue Buton$")
	public void i_click_Continue_Buton() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("^I click No to Are you pregnant$")
	public void i_click_No_to_Are_you_pregnant() throws Throwable {
		System.out.println("The 1 answer is " + driver.findElement(By.xpath("//button[text()='No']")).getText());
		driver.findElement(By.xpath("//button[text()='No']")).click();

	}

	@When("^click No and my period has remained$")
	public void click_No_and_my_period_has_remained() throws Throwable {
		System.out.println("The 2 answer is " + driver
				.findElement(By.xpath("//button[text()='No, and my period has remained unchanged']")).getText());
		driver.findElement(By.xpath("//button[text()='No, and my period has remained unchanged']")).click();
	}

	@Then("^I get Result Page$")
	public void i_get_Result_Page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Result Page title is " + driver.getTitle());
		System.out.println("Result Page url is " + driver.getCurrentUrl());
	}

	@When("^I select Yes, continue with this option Button$")
	public void i_select_Yes_continue_with_this_option_Button() throws Throwable {

		driver.findElement(By.xpath("//button[text()='Yes, continue with this option']")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^go to the Your Plan Page$")
	public void go_to_the_Your_Plan_Page() throws Throwable {
		System.out.println("Plan Page title is " + driver.getTitle());
		System.out.println("Plan Page url is " + driver.getCurrentUrl());
	}

	@When("^select Monthly plan Button$")
	public void select_Monthly_plan_Button() throws Throwable {
		driver.findElement(By.xpath("//label[@for='01_monthly']")).click();
	}

	@When("^click Continue Button$")
	public void click_Continue_Button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

	@Then("^I go to Payment Page$")
	public void i_go_to_Payment_Page() throws Throwable {
		System.out.println("Payment Page title is " + driver.getTitle());
		System.out.println("Payment Page url is " + driver.getCurrentUrl());
	}

}
