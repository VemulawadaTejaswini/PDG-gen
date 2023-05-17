//325
public class func{
public void createURLConnection(String url,boolean dev){
        HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
        connection.setInstanceFollowRedirects(false);
}
}
