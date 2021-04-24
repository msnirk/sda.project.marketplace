import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {


        ConnectionManager connectionManager = new ConnectionManager();


        HibernateUserDao hud = new HibernateUserDao(connectionManager.getSessionFactory());
        Users user = new Users();
        user.setFirstName("Dawid");
        user.setLastName("Guzenda");
        user.setUsername("Guzenda");
        user.setEmail("dguzenda@gmail.com");
        user.setPassword("dupa123");
        hud.saveUser(user);
    }
}

