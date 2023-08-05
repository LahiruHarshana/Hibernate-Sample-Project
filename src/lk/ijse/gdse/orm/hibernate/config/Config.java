package lk.ijse.gdse.orm.hibernate.config;

import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class Config {

    private static Config config;

    private SessionFactory factory;

    private Config(){

        Configuration configuration = new Configuration();
        Properties props = new Properties();

        try {
            props.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.Properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        configuration.addAnnotatedClass(Customer.class);
        factory=configuration.setProperties(props).buildSessionFactory();
    }

    public static Config getInstance(){
        return config == null ? new Config() : config;
    }

    public Session getSession(){
        return factory.openSession();
    }
}
