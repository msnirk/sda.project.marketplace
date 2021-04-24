import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class ConnectionManager {
    private static String url = "jdbc:mysql://localhost:3306";
    private static String username = "root";
    private static String password = "SDAsda504";
    private static Connection con;

    public static Connection getHibernateConnection() {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
           .addAnnotatedClass(Users.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        {
            System.out.println("Connected");
        }
        session.close();
        return con;
    }


    public static Connection getConnection() {

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Server connected!");
            Statement stmt = null;
            ResultSet resultset = null;

            try {
                stmt = connection.createStatement();
                resultset = stmt.executeQuery("SHOW DATABASES;");

                if (stmt.execute("SHOW DATABASES;")) {
                    resultset = stmt.getResultSet();
                }

                while (resultset.next()) {
                    System.out.println(resultset.getString("Database"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                if (resultset != null) {
                    try {
                        resultset.close();
                    } catch (SQLException sqlEx) {
                    }
                    resultset = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) {
                    }
                    stmt = null;
                }

                if (connection != null) {
                    connection.close();
                }
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the server!", e);
        }
        return con;
    }
}