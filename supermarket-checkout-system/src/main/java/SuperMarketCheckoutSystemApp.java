import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperMarketCheckoutSystemApp {

    public static void main(String[] args) {
        System.out.println("Welcome!!! Dear Customer attention our store has deals in place! please pick your products/items! Thank you");

        //Create new Product instances, product deals.
        Product itemA = new Product("A", 50, 3, 130);
        Product itemB = new Product("B", 30, 2, 45);
        Product itemC = new Product("C", 20);
        Product itemD = new Product("D", 15);

        //Adding products to the basket
        Map<String, Product> pricingRules = new HashMap<>();
        pricingRules.put("A", itemA);
        pricingRules.put("B", itemB);
        pricingRules.put("C", itemC);
        pricingRules.put("D", itemD);

        //Create checkout system
        Checkout checkout = new Checkout(pricingRules);

        //Scanner for console inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter SKU codes to scan (or enter 'total' to calculate the total): ");

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("total")) {
                int total = checkout.calculateTotal();
                System.out.println("Total price is: " + total + " pence");
                break;
            } else {
                try {
                    checkout.scanItems(input);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
        System.out.println("Thank you for shopping at our store!");
    }
}
