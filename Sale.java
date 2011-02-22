/**
 * 
 */
public class Sale implements Comparable {
    private String productName;
    private int quant;
    public Sale(Product product, int quant)  {
        productName = product.getName();
        this.quant = quant;

    }

    public String getProductName()  {
        return productName;
    }

    public int getQuant()  {
        return quant;
    }
    
    public void changeQuant(int quant)  {
        this.quant = quant;
    }
    
       public int compareTo(Object ob) {
        return productName.compareTo(((Sale) ob).getProductName());
    }
    
    public String toString()  {
        return productName + ": " + quant;
    }
   

}
