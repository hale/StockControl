import java.util.Random;
/**
 * The test class populates the warehouse program with
 * some sample data.
 */
public class Test  {
    StockControl stockControl;
    Random rand;
    public Test(int productQuant, int saleQuant)  {
        stockControl = new StockControl();
        rand = new Random();
        for (int i = 0; i < productQuant; i++)  {
            addStock(i);
        }
        
        for (int i = 0; i < saleQuant; i++)  {
            addSale();
        }
    }
    
    public boolean addStock(int quant)  {
        
        int initStock = rand.nextInt(200);
        int reorderLevel = (rand.nextInt(10)+1)*10;
        int orderLevel = -1;
        while (orderLevel < initStock)  {
            orderLevel = reorderLevel + (rand.nextInt(11)*20);
        }
        // System.out.println("product"+quant+"    "+initStock+"    "+reorderLevel+"    "+orderLevel);
        return stockControl.newProduct(("product" + quant), initStock, reorderLevel, orderLevel);
    }
    
    public boolean addSale()  {
        return (stockControl.newSale(stockControl.getProduct(rand.nextInt(stockControl.getProductsLength())), (rand.nextInt(23)+1)));
    }
    
}