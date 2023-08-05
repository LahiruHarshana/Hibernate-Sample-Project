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
        return session.get(Customer.class,id);
    }

    public int saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        int customerId = (int) session.save(customer);
        transaction.commit();
        session.close();
        return customerId;
    }
    public boolean updateCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        return true;
    }
}
