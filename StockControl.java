import java.util.ArrayList;
import java.util.Collections;
/**
 * The stock control class
 */
public class StockControl  {
    private ArrayList<Product> products;
    private ArrayList<Sale> sales;

    public StockControl()  {
        products = new ArrayList();
        sales = new ArrayList();

    }

    public boolean newProduct(String name, int initStock, int reorderLevel, int orderLevel)  {
        return products.add(new Product(name, initStock, reorderLevel, orderLevel));
    }

    public boolean newSale(Product product, int quant)  {
        return sales.add(new Sale(product, quant));
    }
    
    public Product getProduct(int index)  {
        return products.get(index);
    }
    
    public int getProductsLength()  {
        return products.size();
    }

  
}

