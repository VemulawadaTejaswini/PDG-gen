public class func{
public void openConnection(String hostname,int port,String path){
      final URL url = new URI("https", null, hostname, port, path, null, null)
          .toURL();
      HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
}
}
