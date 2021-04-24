import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class ConnectionManager {

    private static Connection con;

    public static Connection getConnection() {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
                .addAnnotatedClass(Users.class)
                .addAnnotatedClass(Wallet.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        {
            System.out.println("Connected");
        }
        session.close();
        return con;
    }
}