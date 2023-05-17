public class func{
public void getResponseCode(String URL){
    URL testUrl = new URL(URL);
    conn = (HttpURLConnection) testUrl.openConnection();
    conn.setConnectTimeout(connectionTimeoutInMS);
    conn.setReadTimeout(socketOperationsTimeoutInMS);
    conn.setRequestMethod("HEAD");
    int responseCode = conn.getResponseCode();
}
}
