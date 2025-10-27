Feature: Login functionality
  User with valid credentials
  User Blocked
  USer with invalid credentials

  Scenario Outline: login with different combinations of credentials
    Given the user is on the login page
    When the user enters the username "<login>" and the password "<password>"
    And the user clicks the login button
    Then the user should see "<expected_result>"

    Examples:
      | login            | password        | expected_result                     |
      | standard_user    | secret_sauce1   | Epic sadface: Username and password do not match any user in this service|
      | locked_out_user  | secret_sauce    | Epic sadface: Sorry, this user has been locked out. |
      | standard_user    | secret_sauce    | Products |