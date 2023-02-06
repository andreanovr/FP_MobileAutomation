@login @regression
Feature: Logout

  Background :
    Given user is on homepage before login

  @positive-test @smoke
  Scenario Outline: TC_127 - Room Tenants - verify user can logout with click the Logout in pop-up "do you want to exit ?"
    And user click profil menu
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage tenant after login
    And user click profil menu
    And user is on profil page
    When user click logout button
    And user click logout on popup
    Then user is on homepage before login
    Examples:
      | email | password |
      | andreanovr@gmail.com | andreanovr@gmail.com  |

  @positive-test @smoke
  Scenario Outline: TC_123 - Room Owner - verify user can logout with click the Logout in pop-up "do you want to exit ?"
    And user click profil menu
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage owner after login
    And user click profil menu
    And user is on profil page
    When user click logout button
    And user click logout on popup
    Then user is on homepage before login
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345 |

  @positive-test @smoke
  Scenario Outline: TC_128 - Room Tenants - verify user can logout with click the Cancel in pop-up "do you want to exit ?"
    And user click profil menu
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage tenant after login
    And user click profil menu
    And user is on profil page
    When user click logout button
    And user click cancel on popup
    Then user is on profil page
    Examples:
      | email | password |
      | andreanovr@gmail.com | andreanovr@gmail.com  |

  @positive-test @smoke
  Scenario Outline: TC_124 - Room Owner - verify user can logout with click the Cancel in pop-up "do you want to exit ?"
    And user click profil menu
    And user is on login page
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage owner after login
    And user click profil menu
    And user is on profil page
    When user click logout button
    And user click cancel on popup
    Then user is on profil page
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345 |