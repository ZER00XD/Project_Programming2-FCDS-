package project.sixth;

public class ElectronicProduct extends Product  {
    String brand;
    int warrantyPeriod;

    public ElectronicProduct(int productId, String name, float price, String brand, int warrantyPeriod){
        super(productId,name,price);
        this.brand=brand;
        this.warrantyPeriod=Math.abs(warrantyPeriod);
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
