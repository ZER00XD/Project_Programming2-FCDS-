package project.sixth;

public class Product {
   protected int productId;
    protected String name;
    protected float price;
    public Product(){}
    public Product(int productId, String name, float price){
        this.productId=Math.abs(productId);
        this.name=name;
        this.price=Math.abs(price);
    }

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
