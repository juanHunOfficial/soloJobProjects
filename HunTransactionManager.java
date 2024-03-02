
//Author: Hun, Juan P.
import java.util.*;

public class HunTransactionManager {

    private static String itemName = "Initialized variable to start. will be overridden in the do while";
    private static String sentinelStringValue = "done";
    private static String costEnteredAsString;
    private static double costOfTheItem;
    private static boolean invalidString;
    private static boolean validPrice = true;

    public List<String> listOfItemNames = new ArrayList<>();
    public List<Double> costsForEachItem = new ArrayList<>();

    public void promptTheUserAndStoreValues(Scanner keyboard) {

        do {
            System.out.println("Enter the name of the item, if you wish to exit please enter 'DONE': ");
            itemName = keyboard.nextLine();
            invalidString = itemName.equalsIgnoreCase(sentinelStringValue);

            if (!invalidString)
                listOfItemNames.add(itemName);
            else
                break;

            System.out.println("Enter the cost of the item, if you wish to exit please enter '0': ");
            costEnteredAsString = keyboard.nextLine();
            costOfTheItem = Double.parseDouble(costEnteredAsString);

            if (costOfTheItem != 0)
                costsForEachItem.add(costOfTheItem);
            else {
                validPrice = false;
                break;
            } // end else
            System.out.println();
        } while (invalidString || validPrice);// end while

        setItemList(listOfItemNames);
        setCostList(costsForEachItem);
    }// end method
     ////////////////////////////////////////////////////////////////////////

    private void setItemList(List<String> listOfItemNames) {
        this.listOfItemNames = listOfItemNames;
    }// end setter

    /////////////////////////////////////////////////////////////////////////

    private void setCostList(List<Double> costsForEachItem) {
        this.costsForEachItem = costsForEachItem;
    }// end setter

    ////////////////////////////////////////////////////////////////////////

    public List<String> getItemList() {
        return this.listOfItemNames;
    }// end getter

    //////////////////////////////////////////////////////////////////////
    public List<Double> getCostList() {
        return this.costsForEachItem;
    }// end getter
}// end class
