package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Session session= SessionFactoryConfig.getInstance().getSession();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Lahiru");
        customer.setAddress("Weligama");
        customer.setSalary(20000);


        //1.save
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();

        //2.update
        Session session1 = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();

    }
}