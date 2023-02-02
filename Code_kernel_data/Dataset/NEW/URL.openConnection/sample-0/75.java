//75
public class func{
public void getFromHTTP(String url){
    URL u = new URL(url);
    LOG.info("Accessing URL "+url+" as URL: "+u);
    HttpURLConnection connection = (HttpURLConnection) u.openConnection();
    connection.setConnectTimeout(100000);
    connection.connect();
    if(connection.getResponseCode() >= 400) {
      // error!
      LOG.warn("HTTP Response code when connecting to {} was {}", url, connection.getResponseCode());
      is = connection.getErrorStream();
    } else {
      is = connection.getInputStream();
    }
    return IOUtils.toString(is, connection.getContentEncoding() != null ? connection.getContentEncoding() : "UTF-8");
}
}
