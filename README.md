# Passby_Value_or_Reference
## Created a Product class with the following fields and include appropriate constructors, getters, setters: 
```
- String productName
- double price
```
## Implements methods that illustrate pass-by-value for both primi ves and object references: 
```
- Update Primitve: Write a method void updatePrice(double price) that tries to update the price 
but does not affect the original variable. 
- Modify Object Reference: Write a method void updateProduct(Product product) that changes 
the name and price of the passed object. 
- Reassign Object Reference: Write a method void reassignProduct(Product product) that assigns 
a new object to the parameter and show that the reassignment does not affect the original 
object in the caller, as only the local copy of the reference is modified. 
```
### In each of these methods, you’ll first create the variable outside, pass it to the func on, print the value inside, and then print outside as well, e.g.:
