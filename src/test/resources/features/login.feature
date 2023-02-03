@login @regression
Feature: Login

  Background :
    Given user is on homepage before login

  @positive-test @smoke
  Scenario Outline: 01 Login as a room tenant with valid credentials
    And user click profil menu
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    When user click on login button
    Then user is on homepage tenant after login
    Examples:
      | email | password |
      | andreanovr@gmail.com | andreanovr@gmail.com  |

  @positive-test @smoke
  Scenario Outline: 02 Login as a room owner with valid credentials
    And user click profil menu
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    When user click on login button
    Then user is on homepage owner after login
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |