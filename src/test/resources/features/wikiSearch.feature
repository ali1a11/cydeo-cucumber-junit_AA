Feature: Wikipedia search functionality and verification

  #WSF-Day16_TC#2 --> potential ticket number

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  #@wip
  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @ScenarioOutline2
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    @WikiSearch
    Examples: Search values we are going to be using in this scenario is as below
      | searchValue   | expectedTitle | expectedMainHeader |
      | Steve Jobs    | Steve Jobs    | Steve Jobs         |
      | Adam Smith    | Adam Smith    | Adam Smith         |
      | Blaise Pascal | Blaise Pascal | Blaise Pascal      |
      | Marie Curie   | Marie Curie   | Marie Curie        |

  #@wip
  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header


