package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import model.Customer;

import java.util.ArrayList;

public class SampleController {
    public Label lableText;
    public TextField txtFieldName;
    public TextField txtUserName;
    public TextField txtEmail;
    public TextField txtSalary;
    public TextField txtId;
    public Button btnAddCustomer;
    public TextField txtAddress;
    public TreeTableColumn TableDetails;
    public TreeTableColumn colId;
    public TreeTableColumn ColUserName;
    public TreeTableColumn ColAddress;
    public TreeTableColumn ColSalary;
    public TreeTableColumn ColEmail;
    public Button btnReload;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        String text = txtFieldName.getText();
        lableText.setText("Hello , "+text+"!");
        System.out.println("Button Clicked");
    }
    ArrayList<Customer>CustomerArrayList=new ArrayList<>();
    public void btnAddCustomerOnAction(ActionEvent actionEvent) {

        String id = txtId.getText();
        String textUserName = txtUserName.getText();
        String Address = txtAddress.getText();
        double txtSalaryText = Double.parseDouble(txtSalary.getText());
        String txtEmailText = txtEmail.getText();

        Customer customer= new Customer(id,textUserName,Address,txtSalaryText,txtEmailText);
        CustomerArrayList.add(customer);

    }
}
