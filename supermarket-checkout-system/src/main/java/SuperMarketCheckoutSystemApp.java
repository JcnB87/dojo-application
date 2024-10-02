import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperMarketCheckoutSystemApp {

    public static void main(String[] args) {
        System.out.println("Welcome!!! Dear Customer attention our store has deals in place! please pick your products/items! Thank you");
        Product itemA = new Product("A", 50,3,130);

        //Defining pricing rules
        Map<String, Product> pricingRules = new HashMap<>();
        pricingRules.put("A", itemA);

        //Create checkout system and Scanner for inputs in console
        Checkout checkout = new Checkout(pricingRules);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter SKU codes to scan: ");

        scanner.nextLine();

        scanner.close();


    }
}
