//471
public class func{
public void createConnection(URL url){
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.addRequestProperty("User-Agent", "HockeySDK/Android");
      connection.setInstanceFollowRedirects(true);
}
}
