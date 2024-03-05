
//Author: Hun, Juan P.
import java.util.Scanner;

public class HunTransaction {

    private double amountCustomerEnteredToPay;
    private double changeDueToCustomer;
    private String customerAmountEnteredString;

    public void footTheBill(double totalToBePaid, Scanner keyboard) {
        System.out.printf("Your grand total today is: $%.2f\n", totalToBePaid);
        System.out.println("Enter in the amount you would like to pay: ");
        customerAmountEnteredString = keyboard.nextLine();
        amountCustomerEnteredToPay = Double.parseDouble(customerAmountEnteredString);
        changeDueToCustomer = amountCustomerEnteredToPay - totalToBePaid;
        System.out.println();
        System.out.printf("Your change today will be: $%.2f\n", changeDueToCustomer);
        System.out.println("HAVE A NICE DAY!!!");
    }// end method
}// end class
