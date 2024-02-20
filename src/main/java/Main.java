import java.util.*;

public class Main {

  public static void main(String[] args) 
  {
    // PRINT "Please enter a subtotal and gratuity rate:  “
    
    System.out.println("Please enter a subtotal and gratuity rate:   ");
    
    // CREATE Scanner object “money” for user input
    
    Scanner money = new Scanner(System.in);
    
    // READ subtotal from user input
    // READ gratuity rate from user input
    
    double subtotal = money.nextDouble();
    double gratuity = money.nextDouble();
    
    // CALCULATE the total amount 
    
    double grat = (gratuity / 100) * subtotal;

    double total = subtotal + grat;

    // PRINT the total amount "The gratuity is $" + grat + " and the total is $" + total
    
    System.out.println("The gratuity is $" + grat + " and the total is $" + total);

  }
}