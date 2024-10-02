import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private Map<String, Product> pricedRules;
    private Map<String, Integer> scannedItems;

    public Checkout(Map<String, Product> pricedRules) {
        this.pricedRules = pricedRules;
        this.scannedItems = new HashMap<>();
    }

    public Checkout(Map<String, Product> pricedRules, Map<String, Integer> scannedItems) {
        this.pricedRules = pricedRules;
        this.scannedItems = scannedItems;
    }

    /**
     * @param sku receives the argument from console input. i.e: 'A'.
     *            This method will check if sku 'A' exists in our list of items (if key 'A' exists from our map 'pricedRules')
     *            then increment by 1.
     *            If not, will throw an IllegalArgumentException with the message.
     */
    public void scanItems(String sku) {
        if (!pricedRules.containsKey(sku)) {
            throw new IllegalArgumentException("Invalid SKU: " + sku);
        }
        scannedItems.put(sku, scannedItems.getOrDefault(sku, 0) + 1);
        System.out.println("Scanned item: " + sku);
    }

    public int calculateTotal() {
        return 0;
    }
}
