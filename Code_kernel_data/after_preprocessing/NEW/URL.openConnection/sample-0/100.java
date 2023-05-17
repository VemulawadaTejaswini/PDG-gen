//100
public class func{
public void createRequest(String endpointUrl){
    HttpURLConnection connection = (HttpURLConnection) new URL(endpointUrl).openConnection();
    connection.setRequestMethod("GET");
    connection.setAllowUserInteraction(false);
    connection.setRequestProperty("Content-Length", "0");
    return new HttpURLConnectionRequestAdapter(connection);
}
}
