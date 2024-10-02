import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CheckoutTest {

    Map<String, Product> pricedRules = new HashMap<>();
    Checkout checkout = new Checkout(pricedRules);


    @Test
    public void test_ScanItemA() {
        pricedRules.put("A", new Product("A", 50));
        checkout.calculateTotal();
    }

    @Test
    public void test_ScanItemB() {
        pricedRules.put("B", new Product("B", 45));
        checkout.calculateTotal();
    }
}
