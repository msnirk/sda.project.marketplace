import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class HibernateUserDao implements UserDao {

    private SessionFactory sessionFactory;

    public HibernateUserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveUser(Users users) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Users users1 = new Users();
            users1.setFirstName("Michal");
            users1.setLastName("Maniewski");
            users1.setUsername("Maniek");
            users1.setEmail("msnirk@gmail.com");
            users1.setPassword("dupa123");
            session.save(users1);
            session.save(users);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Users findUserByUsername(String username) {
        return null;
    }

    @Override
    public boolean checkUserByNameAndPassword(String username, String password) {
        return false;
    }
}
