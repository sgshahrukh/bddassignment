Feature: Signup
Scenario: Signup Functionality

Given User is on "https://www.facebook.com"
And user clicks "Create New Account" 
And user enters the following details 
| First name | John| 
| Surname | Doe| 
| Email | john@gmail.com| 
| New password | 1234 | 
| Date | 17| | Month | 02| | Year | 1992 |
| Gender | Male| 
And user clicks "Sign Up"
Scenario: User does not follow form validations
When user enters weak password
Then error message displayed with weak password as "Your password must be at least 6 characters long. Please try another."
And user returns back on registration page
