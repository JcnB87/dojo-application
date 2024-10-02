import java.util.Map;

public class Checkout {

    private Map<String, Product> priceRules;
    private Map<String, Integer> scannedItems;

    public Checkout(Map<String,Product> pricingRules) {
    }

    public Checkout(Map<String,Product> priceRules, Map<String, Integer> scannedItems) {
        this.priceRules = priceRules;
        this.scannedItems = scannedItems;
    }
}
