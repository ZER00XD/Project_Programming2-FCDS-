package project.sixth;

import java.util.Scanner;

public class EcommerceSystem2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        ElectronicProduct obj1=new ElectronicProduct(1,"smartphone",599.9F,"Samsung",1);
        ClothingProduct obj2=new ClothingProduct(2,"Tshirt",19.99F,"Medium","Cotton");
        BookProduct obj3=new BookProduct(3,"OOP",39.99F,"O,Reilly","X Publications");

        Order data=new Order();

        System.out.println("Welcome to the E-Commerce System!");


        System.out.println("Please enter your id");
        int ID=input.nextInt();
        input.nextLine();

        System.out.println("Please enter your name ");
        String name=input.nextLine();

        System.out.println("Please enter your address");

        String address=input.nextLine();
        Customer user=new Customer(ID,name,address);

        System.out.println("How many products  you want to add to your cart?");
        int nproducts=input.nextInt();

        Cart order=new Cart(nproducts);



        for (int i=0;i<nproducts;i++){
            System.out.println("Which products you like to add ? 1- smartphone 2- T-shirt 3- OOP");
            int product=input.nextInt();
            if (product==1){
                order.addProduct(obj1);
            }else if (product==2){
                order.addProduct(obj2);
            } else if (product==3) {
                order.addProduct(obj3);

            }else {
                System.out.println("Plz enter number from {1,2,3}");
            }


        }
        System.out.println("Your total is "+order.calculatePrice()+". Would you like to place order? 1-Yes 2- No");
            order.placeOrder(input.nextInt(),order,user);

    }
}
