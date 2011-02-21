/**
 * 
 */
public class Sale implements Comparable {
    private Product product;
    private int quant;
    public Sale(Product product, int quant)  {
        this.product = product;
        this.quant = quant;

    }

    public Product getProduct()  {
        return product;
    }

    public int getQuant()  {
        return quant;
    }
    
    public void changeQuant(int quant)  {
        this.quant = quant;
    }
    
    public String getProductName()  {
        return product.getName();
    }
    
    public int compareTo(Object ob) {
        return product.getName().compareTo(((Sale) ob).getProductName());
    }
   

}
