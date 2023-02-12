public class func{
public void getInputStreamFromUrl(String urlStr){
    URL url = new URL(urlStr);
    HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();  
      urlConn.setConnectTimeout(5000); 
      urlConn.setReadTimeout(70000);
      InputStream inputStream = urlConn.getInputStream();
}
}
