Feature: Bug 4

  @bug_4
  Scenario: (Jobs page) nomor hp bisa di isi selain angka
    Given user berada di jobs page
    When user klik menu intersip batch july
    Then user berada pada intership batch july
    When user klik buttom apply di intership batch july page
    Then user berada di pengisian data intership
    When user input data diri
    And user klik buttom apply
    Then user berhasil apply
