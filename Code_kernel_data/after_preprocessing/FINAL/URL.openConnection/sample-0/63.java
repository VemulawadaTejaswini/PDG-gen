public class func{
public void exists(String url){
           HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
           con.setRequestMethod("HEAD");
           return con.getResponseCode() == HttpURLConnection.HTTP_OK;
}
}
