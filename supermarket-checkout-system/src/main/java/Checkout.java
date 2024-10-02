import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private Map<String, Product> pricedRules;
    private Map<String, Integer> scannedItems;

    public Checkout(Map<String, Product> pricedRules) {
        this.pricedRules = pricedRules;
        this.scannedItems = new HashMap<>();
    }

    /**
     * @param sku receives the argument from console input. i.e: 'A'.
     * This method will check if sku 'A' exists in our list of items (if key 'A' exists from our map 'pricedRules')
     * then increment by 1.
     * If not, will throw an IllegalArgumentException with the message.
     */
    public void scanItems(String sku) {
        if (!pricedRules.containsKey(sku)) {
            throw new IllegalArgumentException("Invalid SKU: " + sku);
        }
        scannedItems.put(sku, scannedItems.getOrDefault(sku, 0) + 1);
        System.out.println("Scanned item: " + sku);
    }

    /**
     * This method sum the total items from the shopping list
     *
     * @return total shopping
     *
     * i.e: inputting item 'A' twice (of value 50), will return 100, and so on.
     */
    public int calculateTotal() {
        int total = 0;

        for (Map.Entry<String, Integer> skyEntry : scannedItems.entrySet()) {
            String sku = skyEntry.getKey();
            int quantity = skyEntry.getValue();
            Product product = pricedRules.get(sku);
            total += quantity * product.getUnitPrice();
        }
        return total;
    }
}
