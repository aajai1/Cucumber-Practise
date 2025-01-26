package Definitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithHeader {
	@Given("must go to website")
	public void must_go_to_website() {
	    
	}
	@When("username entering")
	public void username_entering(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  List <Map<String,String>> user = dataTable.asMaps(String.class, String.class);
	  String value =user.get(1).get("Names");
	  System.out.println(value);
	  String value1 =user.get(1).get("RollNo");
	  System.out.println(value1);
	}
	@When("cliock Okay")
	public void cliock_okay() {
	  
	}
	@Then("verify")
	public void verify() {
	    
	}




}
