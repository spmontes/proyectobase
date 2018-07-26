Feature: Consult a person
  As a commercial advisor
  I wish to consult the person data
  To view person information

  Scenario: Check person information
    Given I have visited the consultation service
    When Get 1 information for api
    Then  status code is 200
