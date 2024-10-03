import lombok.Getter;
import lombok.Setter;

/**
 * This class represent the Product,
 * containing all the elements to determine if the product/item is included in a bundle or not.
 *
 * Each Product has a 'unit price', and will be tagged to a 'sku'.
 * Product has 'special prices' for determinate ´special quantities' (bundles).
 */
@Getter
@Setter
public class Product {

    private String sku;
    private int unitPrice;
    private int specialQuantity;
    private int specialPrice;

    public Product(String sku, int unitPrice, int specialQuantity, int specialPrice) {
        this.sku = sku;
        this.unitPrice = unitPrice;
        this.specialQuantity = specialQuantity;
        this.specialPrice = specialPrice;
    }

    public Product(String sku, int unitPrice) {
        this.sku = sku;
        this.unitPrice = unitPrice;
    }
}
