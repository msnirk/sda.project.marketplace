public class Main {
    public static void main(String[] args) {

        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.getConnection();

        CryptoListing cryptoListing = new CryptoListing();
        cryptoListing.getCryptoListing();

    }

}

