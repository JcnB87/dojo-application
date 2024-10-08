import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {

    private Checkout checkout;

    @Before
    public void setup() {
        Map<String, Product> pricedRules = new HashMap<>();
        pricedRules.put("A", new Product("A", 50,3,130));
        pricedRules.put("B", new Product("B", 30,2, 45));
        pricedRules.put("C", new Product("C", 20));
        pricedRules.put("D", new Product("D", 15));
        checkout = new Checkout(pricedRules);
    }

    @Test
    public void test_ScanAndCalculate_ItemA() {
        checkout.scanItems("A");
        int total = checkout.calculateTotal();
        assertEquals(50, total);
    }

    @Test
    public void test_ScanAndCalculate_ItemAAndItemB() {
        checkout.scanItems("A");
        checkout.scanItems("B");
        int total = checkout.calculateTotal();
        assertEquals(50 + 30, total);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Scan_InvalidItem() {
        checkout.scanItems("Y");
    }

    //The following tests were implemented with TDD approach
    @Test
    public void test_ScanAndCalculate_ItemAWithBundle() {
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        int total = checkout.calculateTotal();
        assertEquals(130, total);
    }

    @Test
    public void test_ScanAndCalculate_ItemAWithBundle_AndExtraItemAWithoutBundle() {
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        int total = checkout.calculateTotal();
        assertEquals(130 + 50, total);
    }

    @Test
    public void test_ScanAndCalculate_ItemAWithTwoBundles_AndItemBWithoutBundle() {
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("A");
        checkout.scanItems("B");
        int total = checkout.calculateTotal();
        assertEquals(260 + 30, total);
    }
}
