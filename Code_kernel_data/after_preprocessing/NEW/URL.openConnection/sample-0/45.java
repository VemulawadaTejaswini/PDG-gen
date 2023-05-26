//45
public class func{
public void urlExists(String url){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            if (connection.getResponseCode() != 200) {
                throw new IOException("Couldn't find full-size image at " + url);
            }
}
}
