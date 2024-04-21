package project.sixth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {


        @FXML
        private ListView<String> listname;
        @FXML
        TextField customeridTextField;
        @FXML
        TextField nameTextField;
        @FXML
        TextField addressTextField;

        @FXML
        TextField nProductsTextField;


        @FXML
        TextField productnameTextField;
        @FXML
        private Label myLAbel;
        @FXML
        private Label saveLabel;
        private Stage stage;
        private Scene scene;

        Cart order=new Cart(5);
        ElectronicProduct obj1=new ElectronicProduct(1,"smartphone",599.9F,"Samsung",1);
        ClothingProduct obj2=new ClothingProduct(2,"Tshirt",19.99F,"Medium","Cotton");
        BookProduct obj3=new BookProduct(3,"OOP",39.99F,"O,Reilly","X Publications");


        public void save(MouseEvent event){
             order.setnProducts(Integer.parseInt(nProductsTextField.getText()));
             saveLabel.setText("Saved");
        }



    @FXML
        void addname(MouseEvent event) throws IOException {




            if(productnameTextField.getText().equals("smartphone")){
                listname.getItems().add(productnameTextField.getText()+" $599.9");
                order.addProduct(obj1);}
            else if(productnameTextField.getText().equals("T-shirt")){
                listname.getItems().add(productnameTextField.getText()+" $19.99");
                order.addProduct(obj2);
            }else if(productnameTextField.getText().equals("OOP")){
                listname.getItems().add(productnameTextField.getText()+"$39.99");
                order.addProduct(obj3);
            }else{
                myLAbel.setText("Pls enter avalaible product");
            }



        }

        @FXML
        void removename(MouseEvent event) {
            int selectID=listname.getSelectionModel().getSelectedIndex();
            listname.getItems().remove(selectID);

        }

        @FXML
        public void placeOrder(ActionEvent event) throws IOException {
        int ID=Integer.parseInt(customeridTextField.getText());
        String name=nameTextField.getText();
        String address=addressTextField.getText();



                FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view2.fxml"));
                Parent root;
                root = loader.load();
                HelloController2 helloController2 = loader.getController();
                helloController2.displayInfo(order,ID,name,address);



                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

        }


}

