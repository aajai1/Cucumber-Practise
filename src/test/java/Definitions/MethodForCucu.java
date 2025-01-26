package Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	@When("click submit button")
	public void click_submit_button() {
		driver.findElement(By.id("submit")).click();
	   
	}
	@Then("get specifc url to check login is sucesfull")
	public void get_specifc_url_to_check_login_is_sucesfull() {
		String absolute = driver.getCurrentUrl();
		String expected = "practicetestautomation.com/logged-in-successfully/";
	    if(absolute.equals(expected)) {
	    	System.out.println("Logged in successfully.");
	    	
	    }else System.out.println("Issue is Logg In.");
	}



}
