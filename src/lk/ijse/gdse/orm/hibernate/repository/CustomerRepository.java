package lk.ijse.gdse.orm.hibernate.repository;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepository {

    private final Session session;
    public CustomerRepository(){
        session = SessionFactoryConfig.getInstance().getSession();

    }
    public Customer getCustomer(int id){
        return session.get(Customer.class,1);
    }

    public int saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
