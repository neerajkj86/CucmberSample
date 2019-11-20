
Feature: Customers

Scenario: Add a new Customer 

Given: user launch chrome browser 

When  user opens  URL "https://admin-demo.nopcommerce.com/login"
  
  And  user enter Email as "admin@yourstore.com" and Password as "admin"
  
  And click on Login
  
  Then user can view dashboard 
  
  When user click on Customers Menu
  
  And  click on Customers Menu items
  
  And  click on Add New button
  
  Then user view Add new Customer Page 
  
  When user enter Customer info
  
  And click on Save button
  
  Then user can view the confirmation message "The new Customer has been added successfully"
  
  And close the Browser