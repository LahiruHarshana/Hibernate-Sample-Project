package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

      /*  Session session= SessionFactoryConfig.getInstance().getSession();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Lahiru");
        customer.setAddress("Weligama");
        customer.setSalary(20000);


        //1.save
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();*/

        //2.update
//        Session session1 = SessionFactoryConfig.getInstance().getSession();
//        Transaction transaction1 = session1.beginTransaction();
//
//        Customer customer1 = session1.get(Customer.class,1);
//        customer1.setAddress("Matara");
//        customer1.setName("Nimal");
//        //session1.save(customer1);
//        session1.update(customer1);
//        transaction1.commit();
//        session1.close();


        //4.delete
        Session deleteSession = SessionFactoryConfig.getInstance().getSession();
        Transaction deleteTransaction = deleteSession.beginTransaction();

        Customer deleteCustomer = deleteSession.get(Customer.class,1);
        deleteSession.delete(deleteCustomer);
        deleteTransaction.commit();
        deleteSession.close();


    }
}