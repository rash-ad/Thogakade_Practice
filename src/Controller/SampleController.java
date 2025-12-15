package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.ArrayList;

public class SampleController {
    public TextField txtUserName;
    public TextField txtEmail;
    public TextField txtSalary;
    public TextField txtId;
    public TextField txtAddress;
   
    public TableView tableCustomerDetails;
    public TableColumn ColSalary;
    public TableColumn ColAddress;
    public TableColumn ColEmail;
    public TableColumn ColId;
    public TableColumn ColUsername;
    public Button btnAddCustomer;
    public Button btnReload;


    ArrayList<Customer>CustomerArrayList=new ArrayList<>();

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {

        String id = txtId.getText();
        String textUserName = txtUserName.getText();
        String Address = txtAddress.getText();
        double txtSalaryText = Double.parseDouble(txtSalary.getText());
        String txtEmailText = txtEmail.getText();

        Customer customer= new Customer(id,textUserName,Address,txtSalaryText,txtEmailText);
        CustomerArrayList.add(customer);
        System.out.println("ArrayList :"+CustomerArrayList);
        loadTable();


    }

    public void btnReloadOnAction(ActionEvent actionEvent) {
        loadTable();
    }

    private void loadTable() {

        ColId.setCellValueFactory(new PropertyValueFactory<>("id"));
        ColUsername.setCellValueFactory(new PropertyValueFactory<>("name"));


        ObservableList<Customer>customerOBservableList= FXCollections.observableArrayList();
        CustomerArrayList.forEach( customer ->{
            customerOBservableList.add(customer);
        });
        tableCustomerDetails.setItems(customerOBservableList);

    }
}
