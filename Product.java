/**
 * 
 */
public class Product implements Comparable {
    private String name;
    private int initStock;
    private int reorderLevel;
    private int orderLevel;
    public Product(String name, int initStock, int reorderLevel, int orderLevel)  {
        this.name = name;
        this.initStock = initStock;
        this.reorderLevel = reorderLevel;
        this.orderLevel = orderLevel;
    }
    
    public String getName()  {
        return name;
    }
    
    public int getInitStock()  {
        return initStock;
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
}
    