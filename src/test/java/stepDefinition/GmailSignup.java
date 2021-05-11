package stepDefinition;

import java.util.List;
import java.util.Map;

import javax.xml.crypto.dsig.SignedInfo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailSignup {
	
	@Given("User is on signup page")
	public void user_is_on_signup_page() {
	    System.out.println("User is on signup page");
	}
	@When("User enters below details")
	public void user_enters_below_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	  
		List<String> signupData =  dataTable.asList();
		
		System.out.println("First Name - "+ signupData.get(0));
		
		System.out.println("Last Name - "+ signupData.get(1));
		
		System.out.println("Email - "+ signupData.get(2));
		
		System.out.println("--------------------------");
		
		for( String temp : signupData) {
			System.out.println(temp);
		}
		
	}
	
	@When("User enters below details as map")
	public void user_enters_below_details_as_map(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		Map<String, String> data =	dataTable.asMap(String.class, String.class);
		
		System.out.println(data.get("FirstName"));
				
				
		
	}
	
	@When("User enters below details as list of map")
	public void user_enters_below_details_as_list_of_map(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
			List<Map<String, String>> allData = dataTable.asMaps();
		
			for(Map<String, String> data : allData) {
				System.out.println(data.toString());
			}
				
				
		
	}
	
	@Then("User confirms the account")
	public void user_confirms_the_account() {
	   System.out.println("User confirms signup");
	}

}
