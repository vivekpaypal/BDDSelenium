Feature: Search scenario

  
  Scenario: search in snapdeal website
    Given browser is open
    When you search for fan
    Then number of products listed should be 25
   
    
  Scenario: search and open product page
    Given browser is open
    When you search for fan
    Then click on product number 1
    
    