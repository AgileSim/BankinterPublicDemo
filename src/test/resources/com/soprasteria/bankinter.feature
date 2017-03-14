Feature: Bankinter Demo


  Scenario: Mortgage simulation
    Given a potential customer at welcome page
     When he selects mortgage and loans
     Then he should see a mortage simulator
      And take a screenshot

    