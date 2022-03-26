Feature: To validate search functionality in amazon application

  Background: 
    Given user shoud be in amazon webpage

  
  Scenario: user will search the particular product
    When user should type the product name
      | apple | mobile    | laptop       |
      | i mac | realme xt | dell laptops |
    And user click the search button
    Then user will navigate to the product page
