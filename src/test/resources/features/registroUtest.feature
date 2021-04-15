#Author: Mateo Gómez Meneses


  @stories
  Feature: Sign in up in Utest
    As a user, I want to register in utest
    @scenario1
    Scenario Outline: Register in Utest
      Given than Mateo wants to enter the page
      When He enters his datas
      |strName  |strLastName  |strEmail  |strMonth  |strDay  |strYear  |strMobileDevice  |strModel  |strOS  |strPassword  |
      |<strName>|<strLastName>|<strEmail>|<strMonth>|<strDay>|<strYear>|<strMobileDevice>|<strModel>|<strOS>|<strPassword>|


      Then He finds the message
      |strMessage    |
      |<strMessage>  |

      Examples:

        |strName    |strLastName  |strEmail             |strMonth|strDay|strYear|strMobileDevice|strModel|strOS |strPassword|
        |  juan     |   Lopez     |juhanlopez@hotmail.com|January|1      |2000   | Apple         |iPhone 4|iOS 14|123456Mm1234|

