import lombok.Getter;
import lombok.Setter;

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
