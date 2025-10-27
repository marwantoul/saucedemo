Feature: Checkout process for products in the cart
  As a logged-in user
  I want to review my cart and complete the checkout
  So that I can finalize my purchase

  Scenario: Complete checkout process
    Given the user logs in with "standard_user" and "secret_sauce"
    And the user clicks the Add to Cart button for a product
    When the user opens the cart page
    And the user clicks the Checkout button
    And the user enters "first_name", "last_name", and "postal_code"
    And the user clicks the Continue button
    And the user clicks the button Finish
    Then a success message should be displayed