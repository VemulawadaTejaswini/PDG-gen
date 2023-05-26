public class func{
public void connect(){
      URL url = new URL(URL);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
}
}
