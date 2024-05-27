Feature: Register Functionality

  Scenario:Register
    Given Navigate to ParaBank

    When  User clicks on Element on Left Panel
      | register |

    And   User sends key on Right Panel
      | firstName       | Ress61       |
      | lastName        | James61      |
      | address         | Vakfikebir   |
      | city            | Trabzon      |
      | state           | Turkiye      |
      | zipCode         | 61400        |
      | phone           | 0532567 8749 |
      | ssn             | 11111111111  |
      | userName        | -changeIt-   |
      | password        | 12345        |
      | confirmPassword | 12345        |

    And User clicks on Element on Right Panel
      | registerButton |

    Then  Customer should be registered successfully