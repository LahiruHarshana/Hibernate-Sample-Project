package lk.ijse.gdse.orm.hibernate.config;

import org.hibernate.SessionFactory;

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
    public SessionFactory getSession(){

    }


}
