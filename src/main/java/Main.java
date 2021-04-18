import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) throws JSONException {


        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.getConnection();

        CryptoListing cryptoListing = new CryptoListing();
        cryptoListing.getCryptoListing();
        cryptoListing.getFiatListing();

        JSONObject cryptoObj = new JSONObject(cryptoListing.getCryptoListing());
        JSONArray data = cryptoObj.getJSONArray("data");
        JSONObject fiatObj = new JSONObject(cryptoListing.getFiatListing());
        JSONArray fiat = fiatObj.getJSONArray("fiat");
        System.out.println(data.length());
        System.out.println(data.getJSONObject(0).getString("symbol"));
        System.out.println(data.getJSONObject(0).getJSONObject("quote").getJSONObject("USD").getDouble("price"));
        System.out.println(data.getJSONObject(1).getString("symbol"));
        System.out.println(data.getJSONObject(1).getJSONObject("quote").getJSONObject("USD").getDouble("price"));

        System.out.println(fiat.getJSONObject(6).getString("symbol"));
    }
}

