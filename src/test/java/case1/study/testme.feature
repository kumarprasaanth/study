
Feature: Registration
 

  Scenario: Register to TestMeApp
    Given Homepage of testmeapp
    And signin option in homepage
    When click on signin
    And username is entered as "Lalitha12"
    And firstname is entered as "Lali"
    And lastname is enteres as "tha"
    And password is entered as "Password123"
    And confirm password is entered as "Password123"
    And gender is selected as male
    And email id is "others13@gmail.com"
    And mobile number is "1234567891"
    And DOB is "12/12/1997"
    And address is "52,ngo nagar"
    And security question is "what is your birth place"
    And answer is "chennai"
    Then click on register





