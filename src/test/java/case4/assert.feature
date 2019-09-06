
Feature: assert
  

  
  Scenario Outline: assert success
    Given page
    When enter product name "<product>"
    And click find element
    Then click add to cart
    Examples: 
      | product  | 
      | headphone|    
      