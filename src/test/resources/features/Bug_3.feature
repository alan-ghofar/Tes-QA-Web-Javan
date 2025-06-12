Feature: Bug 3

  @bug_3
  Scenario: (solusi-dari-odoo page) field nomor hp bisa di isi selain angka
    Given user berada di solusi-dari-odoo page
    When user input data pribadi
    And user klik submit
    Then user berhasil submit