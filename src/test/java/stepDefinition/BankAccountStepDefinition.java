package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankAccountStepDefinition {
	
	
	@Given("my Current account has a balance of {double}")
	public void currentBalance(Double balance) {
	    System.out.println("Current account balance is - "+ balance);
	}

	@Given("my Savings account has a balance of {double}")
	public void savingBalance(Double balance) {
		 System.out.println("Saving account balance is - "+ balance);
	}

	@When("I transfer {double} from my Current account to my Savings account")
	public void i_transfer_from_my_current_account_to_my_savings_account(Double balance) {
		 System.out.println("Transfered balance is - "+ balance);
	}

	@Then("I should have {double} in my Current account")
	public void i_should_have_in_my_current_account(Double balance) {
		 System.out.println("New Current account balance is - "+ balance);
	}

	@Then("I should have {double} in my Savings account")
	public void i_should_have_in_my_savings_account(Double balance) {
		 System.out.println("New Saving account balance is - "+ balance);
	}

}
