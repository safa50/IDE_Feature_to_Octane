#Auto generated Octane revision tag
@TID3001REV0.0.1
Feature: Calculator Addition

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 7
    Then The result should be 12
