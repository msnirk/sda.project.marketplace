public interface UserDao {

    void saveUser(Users users);
    Users findUserByUsername(String username);
    boolean checkUserByNameAndPassword(String username, String password);
}
