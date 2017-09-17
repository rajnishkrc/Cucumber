Feature: Navigate to TechCanvass Website

  Scenario: Open TechCanvass Home Page Url
    Given I have launched the browser
    When TechCanvass home page is navigated to
    Then Page Title Contains Courses
