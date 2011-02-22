/**
 * 
 */
public class Product implements Comparable {
    private String name;
    private int stock;
    private int reorderLevel;
    private int orderLevel;
    public Product(String name, int stock, int reorderLevel, int orderLevel)  {
        this.name = name;
        this.stock = stock;
        this.reorderLevel = reorderLevel;
        this.orderLevel = orderLevel;
    }
    
    public String getName()  {
        return name;
    }
    
    public int getStock()  {
        return stock;
    }
    
    public void addStock(int quant)  {
        stock += quant;
    }
    
    public void removeStock(int quant)  {
        stock -= quant;
    }
    
    public int getReorderLevel()  {
        return reorderLevel;
    }
    
    public int getOrderLevel()  {
        return orderLevel;
    }
    
    public int compareTo(Object ob)  {
        return this.getName().compareTo(((Product) ob).getName());
    }
    
    public String toString()  {
        return name + "        " + stock + "    " + reorderLevel + "    " + orderLevel;
    }
}
    