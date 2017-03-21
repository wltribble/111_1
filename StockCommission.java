/*
  Name: Will Tribble
  Student ID: 10540462
  Email: wltribbl@go.olemiss.edu
  Course Information: CSCI 111 - Section 01
  Program Source File Name: StockCommission.java
  Programming Assignment: 01
  Program Description: This program takes the name of a buyer and the number of stock
      shares they purchase, then calculates/prints the price of those shares, the amount of
      commission collected by the stockbroker, and the final total.
  References: n/a
  Due Date: Monday 2/27/2017 by 11:59 pm

  In keeping with the honor code policies of the University of Mississippi, the School of
  Engineering, and the Department of Computer and Information Science, I affirm that I have
  neither given nor received assistance on this programming assignment. This assignment
  represents my individual, original effort.
  ... My Signature is on File.
*/

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
