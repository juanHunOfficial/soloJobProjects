import java.util.*;

public class HunRegisterTape {

    private static final double SALES_TAX_PERCENTAGE = 0.07;
    private static double sum = 0;
    private static double taxedAmount = 0;

    public double grandTotal;

    public void calculateRegisterTape(List<String> itemList, List<Double> costList) {

        System.out.println("This is you receipt: ");
        System.out.print("ITEM\t\t\tCOST");
        System.out.println();

        for (int i = 0; i < itemList.size(); i++) {
            System.out.print(itemList.get(i) + "\t\t\t");
            System.out.println(costList.get(i));
        } // end for

        for (int j = 0; j < costList.size(); j++) {
            sum = sum + costList.get(j);
        } // end for
        taxedAmount = sum * SALES_TAX_PERCENTAGE;
        grandTotal = taxedAmount + sum;
        System.out.printf("Pre-tax total: $%.2f\n", sum);
        System.out.printf("Taxes: $%.2f\n", taxedAmount);
        System.out.printf("Grand total: $%.2f\n", grandTotal);

        setGrandTotal(grandTotal);
    }// end method
     ////////////////////////////////////////////////////////////////////

    private void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;

    }// end setter

    ////////////////////////////////////////////////////////////////////
    public double getGrandTotal() {
        return grandTotal;

    }// end getter
}// end class