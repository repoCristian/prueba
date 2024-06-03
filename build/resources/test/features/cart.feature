#lenguaje:en

Feature: Register

  Scenario Outline:Sing up
    Given the user has opened URL
    When the user enter first product and adds it to the cart
      | Amount2   |
      | <amount2> |
    And the user enter second product and adds it to the cart
      | Amount5   |
      | <amount5> |

    Then the user should see 7 products in the cart
    Examples:
      | amount2 | amount5 |
      | 2       | 5       |
