public interface WalletDao {

    void createUserWallet(Wallet wallet);
    Wallet findUserWalletById(int id);

}
