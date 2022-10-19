Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

# control + Alt + L

  Scenario: User should be able to see all 12 months "Select your date of birth" month dropdown menu
    Given User is on the dropdowns page of practice tool
    Then User should see below info on month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |