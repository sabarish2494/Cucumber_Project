Feature: To validate login functionality in fb application

  Background: 
    Given user should be enter the login webpage

  Scenario Outline: To validate invalid username and password
    When user enter the invalid "<username>" and "<password>"
    And user click the login button
    Then user will navigate to the invalid credential page

    Examples: 
      | username   | password   |
      | Selenium   | selenium   |
      | Java       | java       |
      | Greenstech | greenstech |

  @sanity
  Scenario: To validate  the empty username and password
    Given user enter to the login page
    When user clicks the login button
    Then user will navigates to the invalid credential page
