# Make Change Project

## Week 1 Homework for Skill Distillery

### Purpose of the Make Change Program

The purpose of this simple Java program is to take a price and amount tendered input from the user and return the US Dollar denominated bill and coin amounts. For example, if the price of an arbitrary good is established as $23.77 and the amount tendered is $30.00, the change returned is 1 five dollar bill, 1 dollar bill, 2 dimes, and three pennies.

### Internal Operation

In order to take user inputs, a simple scanner is employed within the MakeChange class, and from here all of the functions of the program may proceed. The methods within the class take the user inputs, multiplies them by 100, then casts this returned double to an integer, effectively turning the inputs into two piles of pennies. Once they are altered, the difference is whittled down starting with the largest bill returned, our old pal Andrew Jackson, and makes its way down to pennies. Once completed, the results of each bill are printed to the screen and the program concludes.

### Issues Found and Resolved

The most problematic bug I ran into was related to inaccurate penny counts when using doubles as the variable type for the price difference. When the amount of pennies was supposed to be just one, there was a rounding error that would bounce it up to two. I solved this by using the aforementioned integer conversion, and once the math was being done on a set number of pennies the bug disappeared.

### Things I Would Alter, In Retrospect

Looking back over the code as my time at Skill Distillery draws to a close, there are absolutely some aspects of the program I would alter in order to clean things up a bit and make them more efficient. To start, instead of concatenating a string for the change printout, I would use a Stringbuilder object and append the change in that way. With that function in mind, I would also put a switch statement within the while loop and not print out any change values that were equal to 0. This way, only returned bills and coins would be shown.

For raw functionality, I would also run the program in a loop with an option to continue or escape as it carries on. For example, as it now stands, the program stops if the amount tendered is less than the price of the given item, and also stops once the change is determined. Knowing what I now know, it would be fairly straightforward to implement those features. If I were to go full-on crazy with it, perhaps I could even add a database to some form of a back end in order to persist the amount of bills and coins in the register and take those values into account.  
