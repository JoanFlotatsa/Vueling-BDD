Feature: Search a flight from BCN to AGP

  Scenario: Successful search
    Given Miguel wants to book a flight
    When He looks for a flight from BCN to AGP
    Then Her travel plan destination should be: Málaga
