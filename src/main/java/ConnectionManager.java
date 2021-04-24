import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ConnectionManager {

    private SessionFactory sessionFactory;

    public ConnectionManager() {
        Configuration configuration = new Configuration();
        this.sessionFactory = configuration.configure()
                .addAnnotatedClass(Users.class)
                .addAnnotatedClass(Wallet.class)
                .buildSessionFactory();
    }

    public SessionFactory getSessionFactory() {
                return sessionFactory;
    }
}