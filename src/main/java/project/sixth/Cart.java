package project.sixth;

public class Cart {
     protected int customerId;
     public int nProducts;
     protected Product products[];

    Cart(){}
    Cart(int getnProducts) {
        this.nProducts=getnProducts;
        this.products=new Product[nProducts];
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }


    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        for (int i=0; i < products.length; i++) {
            if (products[i] == null) {
                products[i]=product;
                break;
            }
        }
    }
    public Product removeProduct(Product removing){
        for(int i=0;i<nProducts;i++){
            if (products[i]==removing){
                products[i]=null;
                break;
            }
        }
        return removing;
    }
    String calculatePrice(){
        float sum=0;
        for (int i=0;i<getnProducts();i++){
            sum=sum+products[i].getPrice();
        }
        return Float.toString(sum);
    }
    public void placeOrder(){
         System.out.println("Here is your order S summary:");
    }
}

