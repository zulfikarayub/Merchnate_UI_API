#Author: Zulfikar Ayub
#noinspection CucumberUndefinedStep
Feature: Merchante User Creation

  @Sample123
  Scenario Outline:
  To create User on merchante site

    Given user Lauch the application url "<URL>" and verfiy page title
    And user click on user button
    And user click on new user button
    When user enter the details and click on create user button "<UserName>" "<Password>" "<Email>"
    Then user see the success message and details on the page

    Examples:
      | URL     | UserName          | Password          | Email          |
      | BaseUrl | sample_username_1 | sample_password_1 | sample_email_1 |


  @filtercheck
  Scenario Outline:
  To check created user details using filter

    Given user Lauch the application url "<URL>" and verfiy page title
    And user click on user button
    When user enter email id in the filter box "<Email>" and click on filter button
    Then user see the created user details in the table  "<UserName>"  "<Email>"

    Examples:
      | URL     | UserName          | Password          | Email          |
      | BaseUrl | sample_username_1 | sample_password_1 | sample_email_1 |
