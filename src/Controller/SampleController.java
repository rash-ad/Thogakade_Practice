package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.ArrayList;

public class SampleController {
    public TextField txtCustomerId;
    public TextField txtAddress;
    public TextField txtSalary;
    public TextField txtName;
    public TextField txtEmail;
    public TableView tblCustomerList;
    public TableColumn colCustomerId;
    public TableColumn colName;
    public TableColumn colEmail;
    public TableColumn colAddress;
    public TableColumn colSalary;

    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {

        String customerId = txtCustomerId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());
        String email = txtEmail.getText();

        Customer customer = new Customer(customerId, name, email, salary, address);
        System.out.println("Object : "+customer);

        customerArrayList.add(customer);

        System.out.println("Array List: "+customerArrayList);

        System.out.println("Customer Added: " + customerId + ", " + name + ", " + address + ", " + salary + ", " + email);
        loadTable();
    }

    public void btnReloadOnAction(ActionEvent actionEvent) {
        loadTable();

    }
    private void loadTable(){
        colCustomerId.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

        customerArrayList.forEach(customer -> {
            customerObservableList.add(customer);
        });

        tblCustomerList.setItems(customerObservableList);
    }


}