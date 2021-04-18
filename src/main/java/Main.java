import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) throws JSONException {


        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.getConnection();

        CryptoListing cryptoListing = new CryptoListing();
        cryptoListing.getCryptoListing();

        JSONObject obj = new JSONObject(cryptoListing.getCryptoListing());
        JSONArray data = obj.getJSONArray("data");
        System.out.println(data.length());
        System.out.println(data.getJSONObject(0).getString("symbol"));
        System.out.println(data.getJSONObject(0).getJSONObject("quote").getJSONObject("USD").getDouble("price"));
        System.out.println(data.getJSONObject(1).getJSONObject("quote").getJSONObject("USD").getDouble("price"));

    }
}

