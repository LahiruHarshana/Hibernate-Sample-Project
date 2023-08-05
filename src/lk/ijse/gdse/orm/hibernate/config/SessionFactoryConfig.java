package lk.ijse.gdse.orm.hibernate.config;

import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * This is the session factory configuration class
 */
public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;

    /**
     * Defines default constructor as private
     * to avoid object creation of this class from outside
     */
    private SessionFactoryConfig() {}

    /**
     * @return lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig
     * Singleton the class to avoid object re-creation
     */
    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfig)
                ? factoryConfig = new SessionFactoryConfig()
                : factoryConfig;
    }

    /**
     * @return org.hibernate.Session
     * Returns Hibernate session whenever this method is called
     * by following the steps of Native Bootstrapping
     */
    public Session getSession() {
        // Creates a Service Registry
        StandardServiceRegistry serviceRegistry;

        // Creates a Metadata Object
        Metadata metadata = new MetadataSources(new StandardServiceRegistryBuilder()
                .configure()
                .build())
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(
                        ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        // Creates the Session Factory
        SessionFactory sessionFactory = metadata
                .buildSessionFactory();


        // Opens a new Session and Returns
        return sessionFactory.openSession();
    }
}
