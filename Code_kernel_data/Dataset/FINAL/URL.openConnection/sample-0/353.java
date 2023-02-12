public class func{
public void simplePostRequest(String url,String postType,byte[] data){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
      prepareConnection(connection, postType);
      writeData(connection, data, false);
            return parseResponseWrapper(connection);
}
}
