import java.util.*;

public class Main {

  public static void main(String[] args) 
  {

    System.out.println("Please enter a subtotal and gratuity rate:   ");

    Scanner money = new Scanner(System.in);

    double subtotal = money.nextDouble();
    double gratuity = money.nextDouble();

    double grat = (gratuity / 100) * subtotal;

    double total = subtotal + grat;

    System.out.println("The gratuity is $" + grat + " and the total is $" + total);

  }
}