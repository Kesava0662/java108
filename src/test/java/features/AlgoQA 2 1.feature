Feature: AlgoQA 2 11
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@AlgoQA_login_page
@uid1764906837
@set21
@test001
Scenario Outline: AlgoQA login page
Given I have access to application
Then verify text Login to in algoshack
When I entered Enter your email in algoshack as '<Enter your email>'
And I entered Enter your password in algoshack as '<Enter your password>'
And I selected Login in algoshack
Then verify displayed User signed in successfully in algoshack
When I selected skip in algoshack
Then verify displayed Dashboard in algoshack
And verify displayed AlgoQA Dashboard in algoshack
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|Enter your email|Enter your password|page|content|
|1|suryaprakash@algoshack.com|Surya@123|Algoshack|NA|

#Total No. of Test Cases : 1

