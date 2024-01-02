@author_VP @regression
Feature: User Functionality,
  I should register successfully
  I should see error message while register with existing email

  Background:I launch the browser
    And I open the URL
    And I verify that home page visible successfully

#scenario 8 Verify All Products and product detail page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
#  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. The products list is visible
#  7. Click on 'View Product' of first product
#  8. User is landed to product detail page
#  9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
  @author_VP @regression
  Scenario: 8) verify user can be register
    When I click on "Products" button
    And I verify user is navigated to ALL PRODUCTS page successfully
    And I check All products is visible
    Then I Click on 'View Product' of first product
    And I landed to product detail page
    And I Verify that detail is visible: product name, category, price, availability, condition, brand

#scenario 9 Search Product
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
#  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. Enter product name in search input and click search button
#  7. Verify 'SEARCHED PRODUCTS' is visible
#  8. Verify all the products related to search are visible
  @author_VP @regression
  Scenario: 9) Search Product
    When I click on Products button
    And I verify user is navigated to ALL PRODUCTS page successfully
    And I enter product name in search input
    And I click search button
    And I verify Searched Products is visible
    Then I verify all the products related to search are visible

#  scenario 10 Verify Subscription in home page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Scroll down to footer
#  5. Verify text 'SUBSCRIPTION'
#  6. Enter email address in input and click arrow button
#  7. Verify success message 'You have been successfully subscribed!' is visible
  @author_VP @regression
  Scenario: 10) Verify Subscription in home page
    When I click on Cart button
    And I scroll down to footer
    And I Verify text "SUBSCRIPTION"
    Then I enter email address in input and click arrow button
    And I verify success message You have been successfully subscribed! is visible

#scenario  11 Verify Subscription in Cart page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Cart' button
#  5. Scroll down to footer
#  6. Verify text 'SUBSCRIPTION'
#  7. Enter email address in input and click arrow button
#  8. Verify success message 'You have been successfully subscribed!' is visible
  @author_VP @regression
  Scenario: 11) Verify Subscription in Cart page
    When I scroll down to footer
    And  I Verify text 'SUBSCRIPTION'
    Then I enter email address in input and click arrow button
    And I verify success message You have been successfully subscribed! is visible

#  Scenario: 12 Add Products in Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Products' button
#  5. Hover over first product and click 'Add to cart'
#  6. Click 'Continue Shopping' button
#  7. Hover over second product and click 'Add to cart'
#  8. Click 'View Cart' button
#  9. Verify both products are added to Cart
#  10. Verify their prices, quantity and total price
  @author_VP @regression
  Scenario: 12) Add Products in Cart
    When I click on Products button
    And I Hover over first product and click 'Add to cart'
    And I Click Continue Shopping button
    And I Hover over second product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify both products are added to Cart
    And I Verify their prices, quantity and total price
   #  Scenario: 13 Verify Product quantity in Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'View Product' for any product on home page
#  5. Verify product detail is opened
#  6. Increase quantity to 4
#  7. Click 'Add to cart' button
#  8. Click 'View Cart' button
#  9. Verify that product is displayed in cart page with exact quantity
  @author_VP @regression
  Scenario: 13) Verify Product quantity in Cart
    When I Click 'View Product' button
    And I  Verify product detail is opened
    And I increase quantity to "4"
    And I Click 'Add to cart' button
    Then I Click 'View Cart' button
    And  I Verify that product is displayed in cart page with exact quantity "4"

    #  Scenario : 14 Place Order: Register while Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click Proceed To Checkout
#  8. Click 'Register / Login' button
#  9. Fill all details in Signup and create account
#  10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  11. Verify ' Logged in as username' at top
#  12.Click 'Cart' button
#  13. Click 'Proceed To Checkout' button
#  14. Verify Address Details and Review Your Order
#  15. Enter description in comment text area and click 'Place Order'
#  16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  17. Click 'Pay and Confirm Order' button
#  18. Verify success message 'Your order has been placed successfully!'
#  19. Click 'Delete Account' button
#  20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
  @author_VP @regression
  Scenario: 14) Place order: Register While Checkout
    When I Hover over first product and click 'Add to cart'
    And  I Click View Cart button
    And  I Verify that cart page is displayed
    And  I Click Proceed To Checkout
    And I Click "Register / Login" button
    And I Enter name "Vivek" and email"vivegghgjk@gmail.com" address
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
    And I click "Cart" button
    And I Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click "Place Order"
    And I Enter payment details: "james", "647367436736736763746", "345", "21", "2012"
    And I Click "Pay and Confirm Order" button
    And I Verify success message "Congratulations! Your order has been confirmed!"
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button


#  Scenario: 15 Place Order: Register before Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill all details in Signup and create account
#  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  7. Verify ' Logged in as username' at top
#  8. Add products to cart
#  9. Click 'Cart' button
#  10. Verify that cart page is displayed
#  11. Click Proceed To Checkout
#  12. Verify Address Details and Review Your Order
#  13. Enter description in comment text area and click 'Place Order'
#  14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  15. Click 'Pay and Confirm Order' button
#  16. Verify success message 'Your order has been placed successfully!'
#  17. Click 'Delete Account' button
#  18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
  @author_VP @regression
  Scenario: 15) Place Order: Register before Checkout
    When I Click 'Signup / Login' button
    And I Enter name "Vivek" and email"visaghakdGcs@gmail.com" address
    And I Click Signup button
    And I Fill details: Title "Mr", Name , Email, Password "Password123", Date of birth Day "1" Month "January" Year "1987"
    And I  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And I  Click Create Account button
    And I Verify that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I Verify that Logged in as username is visible
    And I Hover over first product and click 'Add to cart'
    And I Click 'Cart' button
    And I Verify that cart page is displayed
    And I Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click "Place Order"
    And I Enter payment details: "james", "647367436736736763746", "345", "21", "2012"
    And I Click "Pay and Confirm Order" button
    And I Verify success message "Congratulations! Your order has been confirmed!"
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button

  #  Scenario: 16 Place Order: Login before Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill email, password and click 'Login' button
#  6. Verify 'Logged in as username' at top
#  7. Add products to cart
#  8. Click 'Cart' button
#  9. Verify that cart page is displayed
#  10. Click Proceed To Checkout
#  11. Verify Address Details and Review Your Order
#  12. Enter description in comment text area and click 'Place Order'
#  13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  14. Click 'Pay and Confirm Order' button
#  15. Verify success message 'Your order has been placed successfully!'
#  16. Click 'Delete Account' button
#  17. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_VP @regression
  Scenario: 16) Place Order: Login before Checkout
    When I Click 'Signup / Login' button
    And I enter Correct Email "vive@gmail.com" address and Password "Password123@"
    And I click on login button
    And I Verify that Logged in as username is visible
    And I Hover over first product and click 'Add to cart'
    And I Click 'Cart' button
    And I Verify that cart page is displayed
    And I Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click "Place Order"
    And I Enter payment details: "james", "647367436736736763746", "345", "21", "2012"
    And I Click "Pay and Confirm Order" button
    And I Verify success message "Congratulations! Your order has been confirmed!"
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button


#  Scenario : 17 Remove Products From Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click 'X' button corresponding to particular product
#  8. Verify that product is removed from the cart
  @author_VP @regression
  Scenario: 17) Remove Products From Cart
    When I Hover over first product and click 'Add to cart'
    And I Click 'Cart' button
    And I Verify that cart page is displayed
    Then I Click 'X' button corresponding to particular product
    And I Verify that product is removed from the cart


#18 View Category Products
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that categories are visible on left side bar
#4. Click on 'Women' category
#5. Click on any category link under 'Women' category, for example: Dress
#6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
#7. On left side bar, click on any sub-category link of 'Men' category
#8. Verify that user is navigated to that category page
  @author_VP @regression
  Scenario:  18) View Category Products
    When I Verify that categories are visible on left side bar
    And I Click on 'Women' category button
    And I Click on "Dress" category button under Women category
    And I  Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    Then I click On "Men" Category
    And I click on "Tshirts" sub-category of Man
    And I Verify that user is navigated to that category page

#19 View & Cart Brand Products
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify that Brands are visible on left side bar
#5. Click on any brand name
#6. Verify that user is navigated to brand page and brand products are displayed
#7. On left side bar, click on any other brand link
#8. Verify that user is navigated to that brand page and can see products
  @author_VP @regression
  Scenario: 19) View & Cart Brand Products
    When I click on "Products" button
    And I verify that Brands are visible on left side bar
    And I click on "POLO" brand name button
    Then  Verify text 'BRAND - POLO PRODUCTS' is displayed
    Then On left side bar, I click on "H&M" brand link
    Then  Verify text 'BRAND - H&M PRODUCTS' is displayed

#  20 Search Products and Verify Cart After Login
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify user is navigated to ALL PRODUCTS page successfully
#5. Enter product name in search input and click search button
#6. Verify 'SEARCHED PRODUCTS' is visible
#7. Verify all the products related to search are visible
#8. Add those products to cart
#9. Click 'Cart' button and verify that products are visible in cart
#10. Click 'Signup / Login' button and submit login details
#11. Again, go to Cart page
#12. Verify that those products are visible in cart after login as well
  @author_VP @regression
  Scenario: 20) Search Products and Verify Cart After Login
    When I click on "Products" button
    And I verify user is navigated to ALL PRODUCTS page successfully
    And I enter product name in search input
    And I click search button
    And I verify Searched Products is visible
    And I verify all the products related to search are visible
    And   Enter product names in search input and click search and add product to cart
      | product               |
      | Blue Top              |
      | Sleeveless Dress      |
      | Frozen Tops For Kids  |
      | Premium Polo T-Shirts |
    And I Click 'Cart' button
    Then I Verify that products are visible in cart
    When I Click 'Signup / Login' button
    And I enter Correct Email "vive@gmail.com" address and Password "Password123@"
    And I click on login button
    And I Click 'Cart' button
    And I Verify that those products are visible in cart after login as well
      | product               |
      | Blue Top              |
      | Sleeveless Dress      |
      | Frozen Tops For Kids  |
      | Premium Polo T-Shirts |


#21 Add review on product
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Click on 'Products' button
#4. Verify user is navigated to ALL PRODUCTS page successfully
#5. Click on 'View Product' button
#6. Verify 'Write Your Review' is visible
#7. Enter name, email and review
#8. Click 'Submit' button
#9. Verify success message 'Thank you for your review.'
  @author_VP @regression
  Scenario: 21) Add review on product
    When I click on "Products" button
    And I verify user is navigated to ALL PRODUCTS page successfully
    And I Click on 'View Product' of first product
    And I Verify 'Write Your Review' is visible
    And I Enter "name", "email" and "review"
    Then I Click 'Submit' button
    And I Verify success message 'Thank you for your review.'


#22 Add to cart from Recommended items
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Scroll to bottom of page
#4. Verify 'RECOMMENDED ITEMS' are visible
#5. Click on 'Add To Cart' on Recommended product
#6. Click on 'View Cart' button
#7. Verify that product is displayed in cart page
  @author_VP @regression
  Scenario: 22) Add to cart from Recommended items
    When I scroll down to footer
    And I Verify 'RECOMMENDED ITEMS' are visible
    And I Click on 'Add To Cart' on Recommended product
    Then I Click on 'View Cart' button
    And I Verify that product is displayed in cart page

#  23 Verify address details in checkout page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill all details in Signup and create account
#  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  7. Verify ' Logged in as username' at top
#  8. Add products to cart
#  9. Click 'Cart' button
#  10. Verify that cart page is displayed
#  11. Click Proceed To Checkout
#  12. Verify that the delivery address is same address filled at the time registration of account
#  13. Verify that the billing address is same address filled at the time registration of account
#  14. Click 'Delete Account' button
#  15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
  @author_VP @regression
  Scenario: 23) Verify address details in checkout page
    When I click on "Signup / Login" button
    And I verify "New User Signup!" is visible
    And I Enter name "Vivek" and email"vivek@gmail.com" address
    And I Click Signup button
    And I Fill details: Title "Mr", Name , Email, Password "Password123", Date of birth Day "1" Month "January" Year "1987"
    And I  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And I  Click Create Account button
    And I Verify that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I Verify that Logged in as username is visible
    And I Hover over first product and click 'Add to cart'
    And I Click 'Cart' button
    And I Verify that cart page is displayed
    And Verify that the delivery address is same address filled at the time registration of account
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button


#  24 Download Invoice after purchase order
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click Proceed To Checkout
#  8. Click 'Register / Login' button
#  9. Fill all details in Signup and create account
#  10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  11. Verify ' Logged in as username' at top
#  12.Click 'Cart' button
#  13. Click 'Proceed To Checkout' button
#  14. Verify Address Details and Review Your Order
#  15. Enter description in comment text area and click 'Place Order'
#  16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  17. Click 'Pay and Confirm Order' button
#  18. Verify success message 'Your order has been placed successfully!'
#  19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
#  20. Click 'Continue' button
#  21. Click 'Delete Account' button
#  22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  @author_VP @regression
  Scenario: 24)  Download Invoice after purchase order
    When I Hover over first product and click 'Add to cart'
    And I Click 'Cart' button
    And I Verify that cart page is displayed
    And I Click Proceed To Checkout
    And I Click "Register / Login" button
    And I Enter name "Vivek" and email"vivegghgjk@gmail.com" address
    And I Click Signup button
    And I Verify that ENTER ACCOUNT INFORMATION is visible
    And I Fill details: Title "Mr", Name , Email, Password "Password123", Date of birth Day "1" Month "January" Year "1987"
    And I  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And I  Click Create Account button
    And I Verify that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I Verify that Logged in as username is visible
    And I click "Cart" button
    And I Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click "Place Order"
    And I Enter payment details: "james", "647367436736736763746", "345", "21", "2012"
    And I Click "Pay and Confirm Order" button
    And I Verify success message "Congratulations! Your order has been confirmed!"
    And I Click 'Download Invoice' button and verify invoice is downloaded successfully.
    And I click Continue buton
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button


#  25 Verify Scroll Up using 'Arrow' button and Scroll Down functionality
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Scroll down page to bottom
#  5. Verify 'SUBSCRIPTION' is visible
#  6. Click on arrow at bottom right side to move upward
#  7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @author_VP @regression
  Scenario: 25) Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    When I scroll down to footer
    And  I Verify text 'SUBSCRIPTION'
    Then I Click on arrow at bottom right side to move upward
    And I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


#26 Verify Scroll Up without 'Arrow' button and Scroll Down functionality
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Scroll down page to bottom
#5. Verify 'SUBSCRIPTION' is visible
#6. Scroll up page to top
#7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
  @author_VP @regression
  Scenario: 26) Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    When I scroll down to footer
    And  I Verify text 'SUBSCRIPTION'
    Then I Scroll up page to top
    And I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen