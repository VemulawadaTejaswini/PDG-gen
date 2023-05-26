public class func{
public void get(String url){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    printResponse(connection.getInputStream());
}
}
