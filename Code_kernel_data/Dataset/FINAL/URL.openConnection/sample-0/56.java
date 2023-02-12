public class func{
public void getStatusCode(final String url){
      final URL u = new URL(url);
      final HttpURLConnection huc = (HttpURLConnection) u
          .openConnection();
      huc.setRequestMethod("GET"); // OR huc.setRequestMethod ("HEAD");
      huc.connect();
      final int code = huc.getResponseCode();
}
}
