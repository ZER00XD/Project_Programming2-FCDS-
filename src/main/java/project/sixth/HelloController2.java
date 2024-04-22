package project.sixth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController2 {
    @FXML
    private Button LogoutButton;
    @FXML
    private AnchorPane scenePane;
    Stage stage;

    @FXML
    private ListView<String> listorder;
@FXML
    private Label myLabel;


@FXML
    public void displayInfo(Cart cart,int ID,String name,String address){
        Customer customer=new Customer(ID,name,address);
        Order data=new Order();
        float sum=0;
        for (int i=0;i<cart.nProducts;i++){
            if (cart.products[i]==null){
                break;
            }
            sum+=cart.products[i].getPrice();
        }
        listorder.getItems().add("Customer ID \t"+(customer.customerId));
    for (int i=0;i<cart.nProducts;i++) {
        if (cart.products[i]==null){
            break;
        }
        listorder.getItems().add((cart.products[i].getName())+" - $" + (cart.products[i].getPrice()));
    }
        listorder.getItems().add("Total Price : $"+sum);

}
public void logout(ActionEvent event){
    stage=(Stage) scenePane.getScene().getWindow();
    System.out.println("You successfully logged out!");
    stage.close();
}

}
