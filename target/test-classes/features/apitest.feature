@Doctor_Appt
Feature: Doctors_appointments
  Background:Login
    Given User navigate to "https://www.medunna.com/"
    When Click Sign in icon
    And Choose Sign in from dropdown
    And Enter the username
    And Enter the password
    And Click the sign in button
    And Click on MY PAGE
    And Choose My Appointments from dropdown

  @TC_01
  Scenario:TC_01_User (doctor) can see their appointments list and time slots on My Appointments
    Then Verify that their Appointments list on My Appointments page
    Then Verify that their Appointments time slots on My Appointments page

