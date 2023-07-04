@test
Feature: Packages for SA Country
  Background: User navigates to STCtv website
    Given I am user navigated to STCtv website
    When User on subscriptions page for SA
    And User clicks on Select Your Country menu
    And User can see "Kuwait" "Bahrain" and "KSA" options


  Scenario Outline: Validate Plans for KSA
    And User navigated to "KSA" country
    And User can see "<Types>" of plans options
    Then User can see "<Prices>" of each "<Types>"
    Then User can see "KSA" currency
    Examples:
      | Types   | Prices       |
      | lite    | 15 SAR/month |
      | classic | 25 SAR/month |
      | premium | 60 SAR/month |

  Scenario Outline: Validate Plans for Kuawit
    And User navigated to "Kuwait" country
    And User can see "<Types>" of plans options
    Then User can see "<Prices>" of each "<Types>"
    Then User can see "Kuwait" currency
    Examples:
      | Types   | Prices       |
      | lite    | 1.2 KWD/month|
      | classic | 2.5 KWD/month|
      | premium | 4.8 KWD/month|

  Scenario Outline: Validate Plans for Bahrain
    And User navigated to "Bahrain" country
    And User can see "<Types>" of plans options
    Then User can see "<Prices>" of each "<Types>"
    Then User can see "Bahrain" currency
    Examples:
      | Types   | Prices       |
      | lite    | 2 BHD/month  |
      | classic | 3 BHD/month  |
      | premium | 6 BHD/month  |


