//419
public class func{
public void httpSend(URL url){
  (HttpURLConnection) url.openConnection();
conn.setRequestMethod("POST");
conn.setDoOutput(true);
}
}
