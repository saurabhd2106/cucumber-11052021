@Sanity
Feature: Transferring money between accounts in order to manage my money more efficiently
  As a bank client, I want to transfer funds between my accounts whenever I need to

	Background:
	 	Given my Current account has a balance of 1000.00
    And my Savings account has a balance of 2000.00
	
	@Smoke
  Scenario: Transferring money to a savings account
    When I transfer 500.00 from my Current account to my Savings account
    Then I should have 500.00 in my Current account
    And I should have 2500.00 in my Savings account
    
  @Regression  
  Scenario: Transferring money to a Current account
    When I transfer 500.00 from my Current account to my Savings account
    Then I should have 500.00 in my Current account
    And I should have 2500.00 in my Savings account