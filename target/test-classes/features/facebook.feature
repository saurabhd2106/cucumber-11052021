Feature: Gmail Signup Feature

  @Signup
  Scenario: Gmail Signup
    Given User is on signup page
    When User enters below details
      | Saurabh         |
      | Dhingra         |
      | saurabh@abc.com |
      | abc@123         |
      | abc@124         |
    Then User confirms the account

  @Signup
  Scenario: Gmail Signup
    Given User is on signup page
    When User enters below details as map
      | FirstName        | Saurabh         |
      | Last Name        | Dhingra         |
      | Email            | saurabh@abc.com |
      | Password         | abc@123         |
      | COnfirm Password | abc@124         |
    Then User confirms the account

  @Signup
  Scenario: Gmail Signup
    Given User is on signup page
    When User enters below details as list of map
      | FirstName | LastName | Email           | Password |
      | Saurabh   | Dhingra  | saurabh@abc.com | abc@123  |
      | Gaurav    | Yadav    | gaurav@abc.com  | abc@123  |
      | Vaibhav   | Agarwal  | vaibhav@abc.com | abc@123  |
    Then User confirms the account
