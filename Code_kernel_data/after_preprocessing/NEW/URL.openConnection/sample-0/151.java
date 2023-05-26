//151
public class func{
public void connect(String url){
        connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        connection.setUseCaches(false);
}
}
