Feature: Web table user order feature

  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

    # Scenario Template = Scenario Outline
  #@wip
  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientists
    Examples: Famous female scientists
      | productType | quantity | customerName      | street    | city   | state    | zipcode | cardType   | cardNumber   | expDate | expectedName      |
      | MoneyCog    | 2        | Marie Curie       | Paris st  | Paris  | France   | 445556  | Visa       | 111122223333 | 12/24   | Marie Curie       |
      | Familybea   | 3        | List Meitner      | London st | London | England  | 52369   | MasterCard | 563455621575 | 02/23   | List Meitner      |
      | Screenable  | 4        | Rosalind Franklin | Elm st    | Albany | New York | 88855   | Visa       | 885566877521 | 10/23   | Rosalind Franklin |
      | MoneyCog    | 6        | Chien-Shiung Wu   | Lark st   | Tampa  | Florida  | 77886   | Visa       | 222233355887 | 07/24   | Chien-Shiung Wu   |

    @maleScientists
    Examples: Famous male scientists
      | productType | quantity | customerName      | street    | city   | state    | zipcode | cardType   | cardNumber   | expDate | expectedName      |
      | MoneyCog    | 2        | Charles Darwin    | Paris st  | Paris  | France   | 445556  | Visa       | 111122223333 | 12/24   | Charles Darwin    |
      | Familybea   | 3        | Albert Einstein   | London st | London | England  | 52369   | MasterCard | 563455621575 | 02/23   | Albert Einstein   |
      | Screenable  | 4        | Galileo           | Elm st    | Albany | New York | 88855   | Visa       | 885566877521 | 10/23   | Galileo           |
      | MoneyCog    | 6        | Leonardo da Vinci | Lark st   | Tampa  | Florida  | 77886   | Visa       | 222233355887 | 07/24   | Leonardo da Vinci |