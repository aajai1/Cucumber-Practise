package Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MethodForCucu {
	static WebDriver driver;
	@Given("open the site")
	public static void open_the_site() {
	  driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@When("entering username {string}")
	public static void entering_username(String studentname) {
		driver.findElement(By.id("username")).sendKeys(studentname);
		
	}
	@When("password {string}")
	public void password(String studentpassword) {
		driver.findElement(By.id("password")).sendKeys(studentpassword);
	}
	@Then("click submit button")
	public void click_submit_button() {
		driver.findElement(By.id("submit")).click();
	   
	}
	@Then("get specifc url to check login is sucesfull")
	public void get_specifc_url_to_check_login_is_sucesfull() {
		String absolute = driver.getCurrentUrl();
		System.out.println(absolute);
		String expected = "https://practicetestautomation.com/logged-in-successfully/";
	    if(absolute.equals(expected)) {
	    	System.out.println("Logged in successfully.");
	    	
	    }else System.out.println("Issue is Logg In.");
	}
	@Then("get specifc text to check test cse  is failed")
	public void get_specifc_text_to_check_test_cse_is_failed() {
	   WebElement failureMsg = driver.findElement(By.id("error"));
	   System.out.println(failureMsg.getText());
	   if(failureMsg.isDisplayed()) {
		   System.out.println("Error Msg :" + failureMsg.getText());
		   
	   }else System.out.println("No error msg displayed login Something wrong.");
	}



}
