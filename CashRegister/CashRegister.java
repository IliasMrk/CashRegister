/**
   A simulated cash register.
 */
public class CashRegister
{
    /* Private data. */
    private int count;
    private double total;
    
    /* You will need to declare instance variables to store the
    values for the cash register's item count and total price. */

    /* constructor */
    public CashRegister()
    {
        total = 0;
        count = 0;
        
    }

    /* methods (public interface) */
    
    public void clear()
    {
        count = 0;
        total = 0;
        /* This mutator method should reset the local variables 
        that store the values for the item count & total price. */
    }

    public void addItem(double price)
    {
        count++;
        total += price;
        /* This mutator (setter) method will be called each time
        there is a new item added, so you will need to increase
        the item count by 1, and add the current price to the total
        price (current price is the value stored in this method's 
        only parameter, price). */
    }

    public double getTotal()
    {
        return total;/* This is a standard accessor (getter) method. It should
        return the current value stored in the variable you
        declared for the total price. */
    }

    public int getCount()
    {
        return count;
        /* This accessor method should return the value stored for
        the item count. */
    }
} // end of class CashRegister