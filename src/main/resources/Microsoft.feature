Feature: Web Automation Test on Microsoft
  Background: Open Microsoft page
    Given I opened "https://www.microsoft.com/en-us/" page
    Then Validate all main menu items are present

  Scenario: Get Windows 10 menu elements
    Given I go to Windows section
    When I click on Windows 10 menu
    Then Return all elements in the dropdown

  Scenario: Test Visual Studio prices
    Given I search for "Visual Studio"
    Then Return the price of the 3 first elements listed in Software result list
    And Store the price of the first product
    Given I enter the details page on the first product
    Then Validate product price and store it
    When I add the product to the cart
    Then Verify all 3 price amounts are the same
    When I select "20" products
    Then Validate total amount is unit price by "20"
