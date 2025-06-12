Feature: Bug 5

  @bug_5
  Scenario: (Jobs page) nomor hp bisa di isi selain angka
    Given user berada di jobs page
    When user klik menu QC
    Then user berada pada QC
    When user klik buttom apply di QC
    Then user berada di pengisian data QC
    When user input data diri QC
    And user klik buttom apply QC
    Then user berhasil apply QC
