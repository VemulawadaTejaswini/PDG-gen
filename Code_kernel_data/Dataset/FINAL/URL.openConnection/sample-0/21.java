public class func{
public void getResponseAsStream(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestProperty("User-Agent", UA_DEFAULT);
        conn.setConnectTimeout(6000);
        if (conn.getResponseCode() != 200)
            return null;
        InputStream in = conn.getInputStream();
}
}
