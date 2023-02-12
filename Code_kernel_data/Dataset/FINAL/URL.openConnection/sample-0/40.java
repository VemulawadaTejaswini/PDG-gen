public class func{
public void run(){
      URL url = new URL(HTTP_ADDR);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        InputStream is = conn.getInputStream();

        is.read();
      }
}
}
