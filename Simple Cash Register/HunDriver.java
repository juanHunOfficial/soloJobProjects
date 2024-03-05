
// Author: Hun, Juan P.
import java.util.*;

class HunDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        HunTransactionManager newTransaction = new HunTransactionManager();
        HunRegisterTape newRegisterTape = new HunRegisterTape();
        HunTransaction newPaymentBeingMade = new HunTransaction();
        List<String> itemListOfItemsToPass = newTransaction.getItemList();
        List<Double> costListToPass = newTransaction.getCostList();
        double billToBePaid;

        newTransaction.promptTheUserAndStoreValues(keyboard);

        newRegisterTape.calculateRegisterTape(itemListOfItemsToPass, costListToPass);

        billToBePaid = newRegisterTape.getGrandTotal();

        newPaymentBeingMade.footTheBill(billToBePaid, keyboard);

        keyboard.close();
    }// end main

}// end class