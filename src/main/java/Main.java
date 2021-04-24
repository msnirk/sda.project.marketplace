public class Main {

    public static void main(String[] args) {


        ConnectionManager connectionManager = new ConnectionManager();


        UserDao hud = new HibernateUserDao(connectionManager.getSessionFactory());
        WalletDao walletDao = new HibernateWalletDao(connectionManager.getSessionFactory());


        Users user = new Users();
        user.setFirstName("Michal");
        user.setLastName("Maniewski");
        user.setUsername("Maniek");
        user.setEmail("msnirk@gmail.com");
        user.setPassword("dupa123");
        hud.saveUser(user);
        Wallet wallet = new Wallet();
        wallet.setOwner(user);
        wallet.setBitcoin(0);
        wallet.setDolar(0);
        wallet.setEuro(1000);
        wallet.setEtherium(0);
        wallet.setGold(0);
        wallet.setSilver(0);
        walletDao.createUserWallet(wallet);
    }
}

