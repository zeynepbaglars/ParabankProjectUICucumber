Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank

    Given User sends key on Left Panel
      | userName | -changeIt- |
      | password | 12345      |

    When  User clicks on Element on Left Panel
      | loginButton |

    Then  Customer should login successfully

  Scenario Outline: Pay Bill Multiple Values
    Given User clicks on Element on Left Panel
      | billPay |

    And   User sends key on Right Panel
      | payeeName     | <faturaTipi> |
      | address       | Vakfikebir   |
      | city          | Trabzon      |
      | state         | Turkiye      |
      | zipCode       | 61400        |
      | phone         | 0532567 8749 |
      | account       | 1111         |
      | verifyAccount | 1111         |
      | amount        | <amount>     |


    And User clicks on Element on Right Panel
      | sendPaymentButton |

    Then Verify BillPayment successful

    Examples:
      | faturaTipi        | amount |
      | Elektrik Faturasi | 85     |
      | Su Faturasi       | 45     |
      | DogalGaz Faturasi | 120    |



