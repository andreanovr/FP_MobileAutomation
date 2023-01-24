@login @regression
Feature: Login

  Background :
    Given user is on select user page

  @positive-test @smoke
  Scenario Outline: 01 Login as a room tenant with valid credentials
    And user choose Pencari Kos
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    When user click on login button
    Then user is on homepage
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |

  @positive-test @smoke
  Scenario Outline: 02 Login as a room owner with valid credentials
    And user choose Penyewa Kos
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    When user click on login button
    Then user is on homepage
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |