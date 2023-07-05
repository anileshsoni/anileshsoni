@tag
Feature: SampleFeature

  @sampleTest
  Scenario: Login Test
    Given I go to "https://www.techlistic.com/p/selenium-practice-form.html" in chrome browser
    When I enter first name and last name
    And I select gender as "male"