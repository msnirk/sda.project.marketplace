public interface UserDao {

    void saveUser(User user);
    User findUserByUsername(String username);
    boolean checkUserByNameAndPassword(String username, String password);
}
