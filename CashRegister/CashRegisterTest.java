import java.util.Scanner;
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      /* Write code to create Scanner object called input. */
      Scanner input = new Scanner(System.in);
      CashRegister r1 = new CashRegister(); // new instance
      
      System.out.println("Please enter price of first item: ");
      
      /* Write code: use input.nextDouble() to get an item's 
         value and store in a new variable price of type double. */
         double price = input.nextDouble();
         r1.addItem(price); // CashRegister instance method
       
      /* Repeat code to get the second item price 
         and add item to object */
      System.out.println("Please enter price of second item: ");
      
      /* Write code: use input.nextDouble() to get an item's 
         value and store in a new variable price of type double. */
         price = input.nextDouble();
         r1.addItem(price); // CashRegister instance method
       
      System.out.println("Total cost is " + r1.getTotal());
      System.out.println("The number of items bought is "
                                                 + r1.getCount());
            
      /* Write additional code to
         (i) create the remaining two instances of CashRegister;*/
         
         
        CashRegister r2 = new CashRegister();
        System.out.println("Please enter the next items " );
        price = input.nextDouble();
        
        r2.addItem(price);
        r2.addItem(price);
        
        /* (ii) add a number of items in each of them. */
        System.out.println("Total cost is: " + r2.getTotal());
        System.out.println("The number of items is: " + r2.getCount());
        
   }
} // end of class CashRegisterTest