public class SimpleCostCalculation {
    public static void main(String[] args) {
        int items = 50;
        float cost = 22.45f;
        float totalCost = items * cost;
        char currency = '$';

        System.out.println("No of items: " + items);
        System.out.println("Cost per Items: " + cost + currency);
        System.out.println("Total Cost " + totalCost);

    }

}
