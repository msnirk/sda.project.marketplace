
public class Main {

    public static void main(String[] args) {


        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.getConnection();

        HibernateUserDao hud = new HibernateUserDao();
    }
}

