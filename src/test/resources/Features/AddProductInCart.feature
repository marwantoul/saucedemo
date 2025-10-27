
Feature: Adding products to the cart
  As a logged-in user
  I want to add products to my cart
  So that I can purchase them later

  Scenario: Adding a product to the cart
    Given the user logs in with valid credentials "standard_user" and "secret_sauce"
    When the user clicks the "Add to Cart" button for a product
    Then the button changes to "Remove" for that product
    And a cart notification is displayed

