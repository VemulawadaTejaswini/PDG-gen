//23
public class func{
public void delete(String murl){
    URL url = new URL(murl);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("DELETE");
    conn.setConnectTimeout(5000);
    if (conn.getResponseCode() == 204) {
      return true;
    }
}
}
