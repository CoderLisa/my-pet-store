Feature: Purchase a Pet

  As a pet store owner
  I want to be able to sell available pets
  So that my customers can find joy and happiness

  Scenario: Customer successfully purchases a new puppy
    Given the pet store has 2 puppies for sale
    When a customer attempts to buy a puppy
    Then a puppy is sold to the customer
    And the pet store has 1 puppy for sale

  Scenario: Customer attempts to purchase puppy that is spoken for
    Given the pet store has 1 puppy on hold to "Joey"
    When "Sara" attempts to buy a puppy
    Then Sara is told "Sorry that puppy is already spoken for"

  Scenario: No puppies for sale
    Given the pet store has 0 puppies for sale
    When a customer attempts to buy a puppy
    Then the customer is told "Sorry we have no puppies for sale"

  Scenario Outline: Puppies must be 8 weeks old before selling
    Given the pet store has 1 puppy for sale
    And the puppy is <currentWeeks> weeks old
    When a customer attempts to buy a puppy
    Then the customer is told "Please come back in <weeksTil8> weeks"
  Examples:
    | currentWeeks | weeksTil8 |
    | 1            | 7         |
    | 7            | 1         |
