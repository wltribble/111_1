// Importing the input ability
import java.util.Scanner;

// Now begins the actual StockCommission class and main method
public class StockCommission {
  public static void main (String[] args){
    // Creating the input device, named keyboard
    Scanner keyboard = new Scanner(System.in);

    // Create the variables and constants required by this program
    final double SHARE_PRICE = 24.89;
    final double COMMISSION = 2;
    String name;
    int shareNumber;
    double shareCost;
    double commissionAmount;
    double totalAmount;

    // Get the name and number of shares from the user
    System.out.print("\n" + "Please enter your name: ");
    name = keyboard.nextLine();
    System.out.print("Please enter the amount of shares purchased: ");
    shareNumber = keyboard.nextInt();

    // Do the necessary calculations of share cost, commission, and total
    shareCost = SHARE_PRICE * shareNumber;
    commissionAmount = (COMMISSION / 100) * shareCost;
    totalAmount = commissionAmount + shareCost;

    // Print the results
    System.out.println("\n" + "The amount paid to purchase " + shareNumber + " shares is $" + shareCost);
    System.out.println("A " + COMMISSION + "% commission is paid to the stockbroker");
    System.out.println("The commission paid to the stockbroker is $" + commissionAmount);
    System.out.println("The total amount spent by " + name + " is $" + totalAmount + "\n");
  }
}
