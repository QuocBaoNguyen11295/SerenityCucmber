Feature: The user logins incorrect username and password

    Scenario Outline: the user logins unsuccessfully
      Given user types username "<usernameValue>" and password "<PasswordValue>"
      When user presses Enter button
      Then the windows alert is shown that 'User is not valid' and the user is navigated back to the page 'GTPL Bank Home Page'
      Examples:
        | usernameValue | PasswordValue |
        |mgr1234        |mgr!231        |
        |mgr1234        |               |
        |               |312323         |
        |               |               |