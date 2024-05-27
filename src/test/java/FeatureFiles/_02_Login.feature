Feature: Login Functionality

  Background:
    Given Navigate to ParaBank

  Scenario: Login Successfully
    Given User sends key on Left Panel
      | userName | -changeIt- |
      | password | 12345      |

    When  User clicks on Element on Left Panel
      | loginButton |

    Then  Customer should login successfully

    And   User clicks on Element on Left Panel
      | logOut |


  Scenario Outline: Login Failure
    Given User sends key on Left Panel
      | userName | <username> |
      | password | <password> |

    When  User clicks on Element on Left Panel
      | loginButton |

    Then  Customer should not be registered

    Examples:
      | username   | password |
      | -changeIt- | 123456   |
      | Ress       | 12345    |
      | Res61      | 123458   |

