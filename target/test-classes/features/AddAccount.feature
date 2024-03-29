
Feature: Codefios add account functionality validation

Background: Given User is on codefios login page

 
Scenario: 1 - User should be able to login with valid credentials
    When User enters username as "demo1@codefios.com"
    When User enters password as "abc123"
    And User clicks on sign in button
    Then User should be landing on dashboard page
    
    When clicks on list accounts link
    Then User should land on account list page
    
    When user clicks on add account button
    When user enters accont name as "Richie's Life Savings"
    When user enters description as "Money for a rainy day"
    When user enters initial balance as "1,000,000"
    When user enters account number as "062095"
    When user enters contact person as "Richie's Accountant"
    When user clicks on save button
    #Then user should be the account added alert
    
    
