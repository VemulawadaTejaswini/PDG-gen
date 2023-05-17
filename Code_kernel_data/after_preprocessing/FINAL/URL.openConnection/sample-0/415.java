public class func{
public void isNotFound(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        return connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND;
}
}
