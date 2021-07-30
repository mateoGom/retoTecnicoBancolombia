#Author: Mateo Gómez Meneses


  @stories
  Feature: Sign in up in Utest
    As a user, I want to register in utest
    @scenario1
    Scenario Outline: Register in Utest
      Given than Mateo wants to enter the page
      When He enters his datas
      |strName  |strLastName  |strEmail  |strMobileDevice  |strModel  |strOS  |strPassword  |strConfirmPassword|
      |<strName>|<strLastName>|<strEmail>|<strMobileDevice>|<strModel>|<strOS>|<strPassword>| <strConfirmPassword>  |





      Examples:

        |strName    |strLastName  |strEmail             |strMobileDevice|strModel|strOS |strPassword|strConfirmPassword|
        |  juan     |   Lopez     |juhanlopez1@hotmail.com| Apple         |iPhone 4|iOS 14|123456Mm1234|  123456Mm1234  |

