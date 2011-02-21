import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 */
public class StockControl  {
    private ArrayList<Product> products;
    private ArrayList<Sale> sales;

    public StockControl()  {
        products = new ArrayList();
        sales = new ArrayList();

    }

    public void newProduct(String name, int orderNumber, int reorderNumber)  {
        products.add(new Product(name, orderNumber, reorderNumber));
    }

    public void newSale(Product product, int quant)  {
        sales.add(new Sale(product, quant));
    }

    public void processSales()  {
        Collections.sort(sales);
        boolean dupes = true;
        do  {
            for (int i = 0; i < sales.size(); i++)  {
                if (sales.get(i).getProductName().equals(sales.get(i+1).getProductName()))  {
                    sales.get(i).changeQuant(sales.get(i).getQuant() + sales.get(i+1).getQuant());
                    sales.remove(i+1);
                }
                else {
                    dupes = false;
                }
            }
        }    while (dupes);
        
        

    }

    public void printToStock()  {
        

    }
}

