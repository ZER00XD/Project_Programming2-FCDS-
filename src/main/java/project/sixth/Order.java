package project.sixth;

public class Order {
    protected int customerId;
    protected int orderId=1;
    protected Product []products;


    public void printOrderInfo(Cart cart,Customer customer){
        System.out.println(Math.abs(orderId));
        System.out.println(customer.customerId);
        System.out.println("Products :");
        for(int i=0;i<cart.products.length;i++){
        System.out.println(cart.products[i].getName()+" - "+cart.products[i].getPrice());
        }
        System.out.println("Total price : $"+cart.calculatePrice());

    }
}
