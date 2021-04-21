#Autor: leidy Murillo

@stories
Feature: Create User
  AS a user, I want to diligence the formulary for create a user
  @scenario1
  Scenario: Fill formulary
    Given than leidy Open utest Page and Click Join Button

    When  She Fill all register fields
      | strName | strLastName | strEmail                | strBirthMonth | strBirthDay | strBirthYear | strCity | strPostalCode | strPassword   |
      | leidy   | Murillo     | juliieth520@hotmail.com | August        | 10          | 1995         | Medellin| 050001        | leidy123      |

    Then he do click button complete Register
