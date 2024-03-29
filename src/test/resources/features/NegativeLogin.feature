@codefiosNegativeFeature @regression
Feature: Codefios page Negative login functionality validation

  Background: 
    Given User is on codefios login page

  @negativeScenario1
  Scenario Outline: 1 - User should not be able to login with invalid credentials
    When User enters username as "<username>"
    When User enters password as "<password>"
    And User clicks on sign in button
    Then User should be landing on dashboard page

    Examples: 
      | username       | password |
      | demo1@codefios | abc123   |
      | demo@codefios  | abc124   |
      | demo1@codefios | abc124   |
      |                |          |

  #@negativeScenario2 @smoke
  #Scenario: 2 - User should not be able to login with invalid credentials
    #When User enters username as "demo@codefios.com"
    #When User enters password as "abc124"
    #And User clicks on sign in button
    #Then User should be landing on dashboard page
#
  #@negativeScenario3 @smoke
  #Scenario: 3 - User should not be able to login with invalid credentials
    #When User enters username as "demo1@codefios.com"
    #When User enters password as "abc124"
    #And User clicks on sign in button
    #Then User should be landing on dashboard page
#
  #@negativeScenario4 @smoke
  #Scenario: 3 - User should not be able to login with invalid credentials
    #When User enters username as ""
    #When User enters password as ""
    #And User clicks on sign in button
    #Then User should be landing on dashboard page
