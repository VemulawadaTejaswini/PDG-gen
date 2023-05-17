public class func{
public void connect(){
    URL url = new URL(address);
    conn = (HttpURLConnection) url.openConnection();
    conn.setConnectTimeout(CONNECT_TIMEOUT);
    conn.setReadTimeout(READ_TIMEOUT);
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Accept", "*/*");
}
}
