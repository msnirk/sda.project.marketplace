import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class HibernateUserDao implements UserDao {

    private SessionFactory sessionFactory;

    public HibernateUserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public boolean checkUserByNameAndPassword(String username, String password) {
        return false;
    }
}
