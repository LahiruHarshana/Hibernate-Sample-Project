package lk.ijse.gdse.orm.hibernate.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;

    private SessionFactoryConfig(){

    }
    public static SessionFactoryConfig getInstance(){
//        if(factoryConfig==null){
//            return new SessionFactoryConfig();
//        }else {
//            return factoryConfig;
//        }

        return (factoryConfig==null)? factoryConfig = new SessionFactoryConfig() : factoryConfig;

    }
    public Session getSession() {
        StandardServiceRegistry builder = new StandardServiceRegistryBuilder().configure().build();

        Metadata metadata = new MetadataSources(builder).getMetadataBuilder().applyImplicitNamingStrategy(ImplicitNamingStrategyComponentPathImpl.INSTANCE).build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        return sessionFactory.openSession();

    }


}
