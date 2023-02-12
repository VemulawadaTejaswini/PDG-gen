public class func{
public void openConnection(String path,String query){
    query = addDelegationTokenParam(query);
    final URL url = getNamenodeURL(path, query);
    final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("GET");
      connection.connect();
      throwIOExceptionFromConnection(connection, ioe);
}
}
