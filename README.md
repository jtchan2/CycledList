# CycledList
Justin Chan 

The code will basically taken in a given linked list head. From there it will loop through the Linked List keeping each value in an arraylist for comparison later on. After the intial loop,  it will loop (if list doesn't have tail of null) again to check for a repeat or cycle. An if statement will check if the item has already been stored and if it is, it returns the index of the cycle index if not it will return null meaning the linked list doesn't have an cycle.

Run Time:O(n^2) due to the code takes in a head with N items so looping O(n) and comparing if anything from Linked list is in the content array list making it check O(n) also thus creating the n^2
Space Complexity:O(n) since size of arraylist is based off of input of head which can have n number of items in it.
