public class func{
public void ServiceConnectionSE(String url){
        connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);
}
}
