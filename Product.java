/**
 * 
 */
public class Product implements Comparable {
    private String name;
    private int orderNumber;
    private int reorderNumber;
    public Product(String name, int orderNumber, int reorderNumber)  {
        this.name = name;
        this.orderNumber = orderNumber;
        this.reorderNumber = reorderNumber;
    }
    
    public String getName()  {
        return name;
    }
    
    public int getorderNumber()  {
        return orderNumber;
    }
    
    public int getReorderNumber()  {
        return reorderNumber;
    }
    
    public int compareTo(Object ob)  {
        return this.getName().compareTo(((Product) ob).getName());
    }
}
    