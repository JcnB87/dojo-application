# dojo-application
________________________________________________________________________________________________________________________
Dojo Application - goal: 

Train and practice... ->  will be added a submodule regarding a kata exercise

------------------------------------------------------------------------------------------------------------------------
# First Kata project
________________________________________________________________________________________________________________________
# supermarket-checkout-system (submodule)

@Description:

Implement the code for a checkout system that handles pricing schemes such as "apples cost 50 pence, three apples cost £1.30."

Implement the code for a supermarket checkout that calculates the total price or a number of items.
In a normal supermarket, things are identified using Stock Keeping Units, or SKUs.
In our store, we´ll use individual letters of the alphabet (A,B,C,D, and so on).
Our goods are priced individually. In addition, some items are multi-priced: buy 'n' of them, and they´ll cost you 'y' pence.
For example, item 'A' might cost 50pence individually, but this week we have a special offer: buy three 'A´s' and they will cost you £1.30.

Use these prices for the sample:

| Item | Unit Price | Special Price (pence) |
|------|------------|-----------------------|
|A     |50          |3 (quantity) for 130   |
|B     |30          |2 (quantity) for 45    |
|C     |20          |                       |
|D     |15          |                       |


Our checkout accepts items in any order, so that if we scan a B, an A, and another B, we will recognize the two B´s and price them at 45 (for a total price so far of 95).
Because the pricing changes frequently, we need to be able to pass in a set of pricing rules each time we start handling a checkout transaction.

The solution should allow for items to input at the command line, and follow for a final total to be calculated and for a running total after each item is ´scanned´.

OSS

___________________________________________________________________________________________________________________________