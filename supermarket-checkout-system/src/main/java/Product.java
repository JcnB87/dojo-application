import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private String sku;
    private int unitPrice;
    private int specialQuantity;
    private int specialPrice;

}
