package lk.ijse.gdse.orm.hibernate.repository;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;

public class CustomerRepository {

    private final Session session;
    public CustomerRepository(){
        session = SessionFactoryConfig.getInstance().getSession();

    }
    public Customer getCustomer(){
        return session.get(Customer.class,1);
    }

}
