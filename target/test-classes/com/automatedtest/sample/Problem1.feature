Feature: Problem1 page

Feature: Problem1 page

  Scenario Outline: To veridy Values diplahy on right side and greatere than 0
    Given the values are  "<Value1>","<Value2>","<Value3>","<Value4>","<Value5>" 
    Then to Verify right count of values
    and to Verify values are greater than 0
	
    Examples:
      | Value1 | Value2 | Value3 | Value4 | Value4 |
      | $122,325.24 | $599.00 | $850,139.99 | $23,329.50 | $566.27 | 

     
       
  Scenario Outline: Need to verify total balance Based on Values 
    Given The values "<Value1>","<Value2>","<Value3>","<Value4>","<Value5>" and "<TotalBalance>
    Then to Verify total balance is Correct based on values list 
	And to formated of values are in currencies
	And verify total balane matches the sum of the values.

    Examples:
      | Value1 | Value2 | Value3 | Value4 | Value4 | TotalBalance|
      | $122,325.24 | $599.00 | $850,139.99 | $23,329.50 | $566.27 | $1,000,000.00 |
            
        