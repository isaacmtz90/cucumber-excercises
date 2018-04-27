Feature: Shout

  Scenario:Listener within range
    Given Lucy is 15m from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy should hear Sean's message

  
  Scenario:Listener hears a different message
    Given Lucy is 15m from Sean
    When Sean shouts "free coffee at Sean's"
    Then Lucy should hear Sean's message

