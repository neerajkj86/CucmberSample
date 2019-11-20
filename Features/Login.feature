Feature: Login
  
  Scenario: Successfull Login with Valid Credentials 
  
  Given  user launch chrome browser 
  
  When  user opens  URL "https://admin-demo.nopcommerce.com/login"
  
  And  user enter Email as "admin@yourstore.com" and Password as "admin"
  
  And click on Login
  
  Then Page Title should be "Dashboard / nopCommerce administration"
  
  When user click on log out link
  
  Then Page Title should be "Your store. Login"
  
  And close the browser
  
  
  Scenario Outline: Login  Data Driven 
  
  Given  user launch chrome browser 
  
  When  user opens  URL "https://admin-demo.nopcommerce.com/login"
  
  And  user enter Email as "<email>" and Password as "<password>"
  
  And click on Login
  
  Then Page Title should be "Dashboard / nopCommerce administration"
  
  When user click on log out link
  
  Then Page Title should be "Your store. Login"
  
  And close the browser


  Examples: 
  
  |email|           |password| 
  |admin@yourstore.com||admin|
  |admin1@yourstore.com||admin123|