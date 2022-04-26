Feature: The user logins successfully

    Scenario: the user logins successfully
      Given user types username 'mgr123' and password 'mgr!23'
      When user clicks on login button
      Then the page 'GTPL Bank Manager HomePage' is opened