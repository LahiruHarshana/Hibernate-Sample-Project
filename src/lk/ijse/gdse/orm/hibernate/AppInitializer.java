package lk.ijse.gdse.orm.hibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse.orm.hibernate.config.Config;
import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import lk.ijse.gdse.orm.hibernate.repository.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer extends Application {



//    public static void main(String[] args) {
//
//      /*  Session session= SessionFactoryConfig.getInstance().getSession();
//        Customer customer = new Customer();
//        customer.setId(1);
//        customer.setName("Lahiru");
//        customer.setAddress("Weligama");
//        customer.setSalary(20000);
//
//
//        //1.save
//        Transaction transaction = session.beginTransaction();
//        session.save(customer);
//        transaction.commit();
//        session.close();*/
//
//        //2.update
////        Session session1 = SessionFactoryConfig.getInstance().getSession();
////        Transaction transaction1 = session1.beginTransaction();
////
////        Customer customer1 = session1.get(Customer.class,1);
////        customer1.setAddress("Matara");
////        customer1.setName("Nimal");
////        //session1.save(customer1);
////        session1.update(customer1);
////        transaction1.commit();
////        session1.close();
//
//
//        //4.delete
//        /*Session deleteSession = SessionFactoryConfig.getInstance().getSession();
//        Transaction deleteTransaction = deleteSession.beginTransaction();
//
//        Customer deleteCustomer = deleteSession.get(Customer.class,1);
//        deleteSession.delete(deleteCustomer);
//        deleteTransaction.commit();
//        deleteSession.close();*/
//
//        Session session=Config.getInstance().getSession();
//
//        Transaction trans = session.beginTransaction();
//
//        Customer customer = new Customer();
//        customer.setId(3);
//        customer.setName("Lahiru");
//        customer.setAddress("Weligama");
//        customer.setSalary(20000);
//
//        session.save(customer);
//        trans.commit();
//        session.close();
//        launch(args);
//    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent =  FXMLLoader.load(getClass().getResource("/lk/ijse/gdse/orm/hibernate/view/customerView.fxml"));
        stage.setScene(new Scene(parent));
        stage.centerOnScreen();
        stage.setResizable(false);

        stage.show();
    }
}