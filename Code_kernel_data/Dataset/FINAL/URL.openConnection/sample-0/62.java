public class func{
public void staticFileExists(String file){
            HttpURLConnection connection = (HttpURLConnection) new URL(getStaticCreeperhostLink(file)).openConnection();
            connection.setRequestProperty(CACHE_CONTROL, "no-transform");
            connection.setRequestMethod("HEAD");
            return (connection.getResponseCode() == 200);
}
}
