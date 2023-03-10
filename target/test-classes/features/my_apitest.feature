@DrAppt
Feature: doctor appointment

  Background:
    Given user given api "https://medunna.com"

  Scenario Outline: Getting specific data
    When user sends a Get request to "/api/appointments/<id>"
    Then user validates "<id>""<patientId>", "<StartDate>", "<EndDate>", "<Status>"
    Examples:
      | id     | patientId | StartDate            | EndDate              | Status  |
      | 169761 | 169369    | 2022-08-16T00:00:00Z | 2022-08-16T01:00:00Z | PENDING |




