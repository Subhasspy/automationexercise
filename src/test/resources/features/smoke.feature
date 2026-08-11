Feature: smoke test
  Scenario: Home page loads successfully
    Given the user navigates to the automation exercise home page
    Then the page title should contain "Automation Exercise"