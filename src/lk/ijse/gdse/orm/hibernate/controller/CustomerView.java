package lk.ijse.gdse.orm.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.gdse.orm.hibernate.config.Config;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import lk.ijse.gdse.orm.hibernate.repository.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerView {


    @FXML
    private TextField adTxt;

    @FXML
    private Button scBtn;
    @FXML
    private TextField idTxt;

    @FXML
    private TextField nmTxt;

    @FXML
    private TextField salTxt;

    @FXML
    void svBtnOnAction(ActionEvent event) {
//        Customer customer = customerRepository.getCustomer()

        CustomerRepository customerRepository = new CustomerRepository();

        Session session= Config.getInstance().getSession();

        Transaction trans = session.beginTransaction();

        Customer customer = new Customer(Integer.parseInt(idTxt.getText()),nmTxt.getText(),adTxt.getText(),Double.parseDouble(salTxt.getText()));
        customerRepository.saveCustomer(customer);



//        session.save(customer);
        trans.commit();
        session.close();
    }
    @FXML
    void scBtnOnAction(ActionEvent event) {

        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = customerRepository.getCustomer(Integer.parseInt(idTxt.getText()));

        Session session= Config.getInstance().getSession();

        Transaction trans = session.beginTransaction();
        nmTxt.setText(customer.getName());
        adTxt.setText(customer.getAddress());
        salTxt.setText(String.valueOf(customer.getSalary()));
        customerRepository.saveCustomer(customer);
        trans.commit();
        session.close();

    }
}
