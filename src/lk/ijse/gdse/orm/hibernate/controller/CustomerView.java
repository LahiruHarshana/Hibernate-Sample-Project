package lk.ijse.gdse.orm.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.ijse.gdse.orm.hibernate.config.Config;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import lk.ijse.gdse.orm.hibernate.repository.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerView {

    CustomerRepository customerRepository = new CustomerRepository();
    @FXML
    private TextField adTxt;

    @FXML
    private TextField idTxt;

    @FXML
    private TextField nmTxt;

    @FXML
    private TextField salTxt;

    @FXML
    void svBtnOnAction(ActionEvent event) {
//        Customer customer = customerRepository.getCustomer()

        Session session= Config.getInstance().getSession();

        Transaction trans = session.beginTransaction();

        Customer customer = new Customer(Integer.parseInt(idTxt.getText()),nmTxt.getText(),adTxt.getText(),Double.parseDouble(salTxt.getText()));
        customerRepository.saveCustomer(customer);



//        session.save(customer);
        trans.commit();
        session.close();
    }
}
