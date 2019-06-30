@Testtag
Feature: Testing the Login Application

Background: 	
	Given The application is launched
	When all input fields are available

@positive-1
Scenario Outline: Positive scenario -1			
And Enter the valid "<Username>" and valid "<Password>" with case-sensitive
Then it should be navigated to result page
Examples:
|Username|Password|
|Maneesh|GamePlan|


@positive-2
Scenario Outline: Positive scenario -2			
And Enter the valid "<Username>" and valid "<Password>" with case-sensitive			
Then Role of use should be displayed result page
Examples:
|Username|Password|
|Maneesh|GamePlan|


@Negative-1
Scenario Outline: Negative scenario -1		
And Enter the Invalid "<Username>" and valid "<Password>"		
Then Proper Error Message should be displayed in the Login page
Examples:
|Username|Password|
|Menon|GamePlan|

@Negative-2
Scenario Outline: Negative scenario -2			
And Enter the valid "<Username>" and Invalid "<Password>"			
Then Proper Error Message should be displayed in the Login page
Examples:
|Username|Password|
|Maneesh|GamePlay|

@Negative-3
Scenario Outline: Negative scenario -3			
And Enter the valid "<Username>" and valid "<Password>" with case-insensitive			
Then Proper Error Message should be displayed in the Login page
Examples:
|Username|Password|
|Maneesh|gameplan|
|maneesh|GamePlan|