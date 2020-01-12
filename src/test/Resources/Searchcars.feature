Feature: Search Cars
  As a User
  I want to search for cars in google and work on specific Gumtree links.
  So that User can see the respective result.
@Smoke
  Scenario: Searching for Cars in google.Then Validate and Navigate Gumtree links.
    Given User is on Google page.
    When  User search for Cars in London,then click on search bar.
    And   User make sure print out all search results links.
    And   User validate how many Gumtree links are,then Navigate each of them,and confirm the Title is displayed and Make sure the Gumtree links results are greater then "Zero"
    Then  User can see respective result.
