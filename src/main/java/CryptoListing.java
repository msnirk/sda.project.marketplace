import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CryptoListing {

    private static String apiKey = "c11564d3-18ef-4eb7-8dc4-4fa2d2c84cf6";

    public static String getCryptoListing() {
        String uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
        List<NameValuePair> paratmers = new ArrayList<NameValuePair>();
        paratmers.add(new BasicNameValuePair("start", "1"));
        paratmers.add(new BasicNameValuePair("limit", "2"));
        paratmers.add(new BasicNameValuePair("convert", "USD"));

        try {
            String result = makeAPICall(uri, paratmers);
            return result;
        } catch (IOException e) {
            System.out.println("Error: cannont access content - " + e.toString());
        } catch (URISyntaxException e) {
            System.out.println("Error: Invalid URL " + e.toString());
        }
        return " ";
    }

    public static String getFiatListing() {
        String uri = "https://pro-api.coinmarketcap.com/v1/fiat/map";
        List<NameValuePair> paratmers = new ArrayList<>();
        paratmers.add(new BasicNameValuePair("start", "1"));
        paratmers.add(new BasicNameValuePair("limit", "100"));
        paratmers.add(new BasicNameValuePair("sort", "id"));
        paratmers.add(new BasicNameValuePair("include_metals", "true"));


        try {
            String result = makeAPICall(uri, paratmers);
            return result;
        } catch (IOException e) {
            System.out.println("Error: cannont access content - " + e.toString());
        } catch (URISyntaxException e) {
            System.out.println("Error: Invalid URL " + e.toString());
        }
        return " ";
    }


        public static String makeAPICall (String uri, List < NameValuePair > parameters)
            throws URISyntaxException, IOException {
            String response_content = "";

            URIBuilder query = new URIBuilder(uri);
            query.addParameters(parameters);

            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet request = new HttpGet(query.build());

            request.setHeader(HttpHeaders.ACCEPT, "application/json");
            request.addHeader("X-CMC_PRO_API_KEY", apiKey);

            CloseableHttpResponse response = client.execute(request);

            try {
                System.out.println(response.getStatusLine());
                HttpEntity entity = response.getEntity();
                response_content = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
            } finally {
                response.close();
            }

            return response_content;
        }

}
