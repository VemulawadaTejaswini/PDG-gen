public class func{
public void fileExistsURL(String url){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestProperty(CACHE_CONTROL, "no-transform");
            connection.setRequestMethod("HEAD");
            int code = connection.getResponseCode();
}
}
