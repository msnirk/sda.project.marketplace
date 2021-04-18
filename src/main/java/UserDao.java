/*import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.model.User;
import net.javaguides.hibernate.util.HibernateUtil;


public class UserDao {

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
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
}
*/