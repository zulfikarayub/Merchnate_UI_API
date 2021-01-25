#Author: Zulfikar Ayub
Feature: Merchante Rest API


  @jsonsamplePost
  Scenario Outline:
  To Post the value to POSTS and comments

    Given user launch the base uri "<Base_URI>"
    And user post the value to the following resources "<Resources>"
    Then user check the status code "<code>"

    Examples:
      | Base_URI    | Resources | code |
      | Base_APIURI | posts     | 201  |
      #| Base_APIURI | comments | |201|

  @jsonsampleGet
  Scenario Outline:
  To get the value from POSTS and comments

    Given user launch the base uri "<Base_URI>"
    And user get the value from the following resources "<Resources>" with "<ID>"
    Then user check the status code "<code>"

    Examples:
      | Base_URI    | Resources | ID | code |
      | Base_APIURI | posts     | 3  | 200  |
      | Base_APIURI | comments  | 3  | 200  |


  @jsonsampleUpdate
  Scenario Outline:
  To update the value to POSTS and comments

    Given user launch the base uri "<Base_URI>"
    And user update the value from the following resources "<Resources>" with "<ID>"
    Then user check the status code "<code>"

    Examples:
      | Base_URI    | Resources | ID  | code |
      | Base_APIURI | posts     | 115 | 200  |
      #| Base_APIURI | comments |3 | 201|


  @jsonsampleDelete
  Scenario Outline:
  To Delete the value to POSTS and comments

    Given user launch the base uri "<Base_URI>"
    And user delete the value from the following resources "<Resources>" with "<ID>"
    Then user check the status code "<code>"

    Examples:
      | Base_URI    | Resources | ID | code |
      | Base_APIURI | posts     | 29 | 500  |
      #| Base_APIURI | comments |3 | 201|
      