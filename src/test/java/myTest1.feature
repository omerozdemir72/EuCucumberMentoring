Feature: Login Functionality

  Scenario Outline: Login with valid username and password

    Given Websiteye git

    And Sign in butonuna tıkla

    And "<Email>" girisi yap

    And Create an Account butonuna tıkla

    And Title sec

    And firstname "<Firstname>" ve  lastname "<lastname>" gir

    And password "<Password>" gir


    When Company "<Company>" gir

    Then Adres "<Address>" gir

    Examples:
      |Email| Firstname|lastname | Password | Company | Address|
      |omeroz@gmail.com| Omer| Ozdemir | omer123|Techno Study|RicardaHuchWeg22|
      |huseyinoz@gmail.com| Huseyin| Ozdemir | asd123|Google|RicardaHuchWeg23|
      |cigdemArslan@gmail.com| Cigdem| Arslan | 123123|Apple|RicardaHuchWeg24|
      |yusufOzdemir@gmail.com| Yusuf| Ozdemir | 22123|Siemens|RicardaHuchWeg25|

