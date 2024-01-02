@author_VP @regression
Feature: Register user and Login functionality
  As a user, I should be able to register a new account and then login with valid credential and unable to login with invalid credentials

  Background:I launch the browser
    And I open the URL
    And I verify that home page visible successfully

#Test Case 1: Register User
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Signup / Login' button
#        5. Verify 'New User Signup!' is visible
#        6. Enter name and email address
#        7. Click 'Signup' button
#        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#        9. Fill details: Title, Name, Email, Password, Date of birth
#        10. Select checkbox 'Sign up for our newsletter!'
#        11. Select checkbox 'Receive special offers from our partners!'
#        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#        13. Click 'Create Account button'
#        14. Verify that 'ACCOUNT CREATED!' is visible
#        15. Click 'Continue' button
#        16. Verify that 'Logged in as username' is visible
#        17. Click 'Delete Account' button
#        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
  @author_VP @regression
  Scenario: 1) verify user can be register
    When I click on "Signup / Login" button
    And I verify "New User Signup!" is visible
    And I Enter name "Vivek" and email"vivfdfsdfddsek@gmail.com" address
    And I Click Signup button
    And I Verify that ENTER ACCOUNT INFORMATION is visible
    And I Fill details: Title "Mr", Name , Email, Password "Password123", Date of birth Day "1" Month "January" Year "1987"
    And I Select checkbox Sign up for our newsletter!
    And I Select checkbox Receive special offers from our partners!
    And I  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And I  Click Create Account button
    And I Verify that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I Verify that Logged in as username is visible
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button

# scenario 2 Login User with correct email and password
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'Login to your account' is visible
#  6. Enter correct email address and password
#  7. Click 'login' button
#  8. Verify that 'Logged in as username' is visible
#  9. Click 'Delete Account' button
#  10. Verify that 'ACCOUNT DELETED!' is visible
  @author_VP @regression
  Scenario: 2) Login user with correct email and password
    When I click on "Signup / Login" button
    And I verify Login to your account is visible
    And I enter Correct Email "don@gmail.com" address and Password "Password"
    And I click on login button
    And I Verify that Logged in as username is visible
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button

  @author_VP @regression
  Scenario Outline: 3) Login user with incorrect email and password
    When I click on "Signup / Login" button
    And I verify Login to your account is visible
    And I Enter incorrect email <email> address and password <password>
    Then I click on login button
    And I verify error your email or password is incorrect! is visible
    Examples:
      | email                | password      |
      | "patel@gmail.com"    | "Passwordfkj" |
      | "jdkjfk@gmail.com  " | "nfjadnjfnaw" |
      | "jdjfk@gmail.com  "  | "nfadnjfnaw"  |

  @author_VP @regression
  Scenario: 4) Logout User
    When I click on "Signup / Login" button
    And I verify 'Login to your account' is visible
    And I enter Correct Email "don@gmail.com" address and Password "Password"
    And I click on login button
    And I Verify that Logged in as username is visible
    Then I click Logout button
    And I verify that user is navigated to login page

  @author_VP @regression
  Scenario: 5) Register user with existing email
    When I click on "Signup / Login" button
    And I verify "New User Signup!" is visible
    And I Enter name "Vivek" and already registered email "don@gmail.com" address
    And I Click Signup button
    Then I should see error message Email address already exist!


#scenario 6: Contact Us Form
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Contact Us' button
#        5. Verify 'GET IN TOUCH' is visible
#        6. Enter name, email, subject and message
#        7. Upload file
#        8. Click 'Submit' button
#        9. Click OK button
#        10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#        11. Click 'Home' button and verify that landed to home page successfully
  @author_VP @regression
  Scenario Outline: 6) Contact us Form
    When I click on a "Contact Us" button
    And I Verify 'GET IN TOUCH' is visible
    And I Enter "<name>", "<email>", "<subject>" and "<message>"
    And I Upload file
    Then I click on Submit button
    And I click on OK button
    And I verify success message "Success! Your details have been submitted successfully." is visible
    And I Click 'Home' button
    And I verify that landed to homepage successfully
    Examples:
      | name  | email             | subject | message                   |
      | Patel | jajasdj@gmail.com | product | please contact as soon as |

#scenario 7: Verify Test Cases Page
#        1. Launch browser
#        2. Navigate to url 'http://automationexercise.com'
#        3. Verify that home page is visible successfully
#        4. Click on 'Test Cases' button
#        5. Verify user is navigated to test cases page successfully
  @author_VP @regression
Scenario: 7) Verify test cases page

  When I click on the "Test Cases" button
  Then I verify user is navigated to cases page successfully


