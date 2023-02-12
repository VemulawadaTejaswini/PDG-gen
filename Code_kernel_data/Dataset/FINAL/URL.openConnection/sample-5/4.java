public class func{
public void openConnection(String path,String query){
      final URL url = new URI("https", null, nnAddr.getHostName(),
          nnAddr.getPort(), path, query, null).toURL();
      HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
}
}
