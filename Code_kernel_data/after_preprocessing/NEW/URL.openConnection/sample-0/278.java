//278
public class func{
public void makeRemoteRequest(String baseURL,String relativePath){
      URL url = new URL(baseURL + "/" + relativePath);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      return readResponse(connection.getInputStream());
}
}
