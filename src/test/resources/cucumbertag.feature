Feature: Search scenario

  Description:
    This test is a example for the tag feature and uses scenario outline.
 
   Scenario Outline: search in snapdeal website
	    Given browser is open
	    When you search for fan
	    Then number of products listed should be <number>
	    @smoke
	    Examples:
	    |number|
	    | 25   |