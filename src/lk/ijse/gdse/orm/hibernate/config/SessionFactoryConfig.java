package lk.ijse.gdse.orm.hibernate.config;

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


}
