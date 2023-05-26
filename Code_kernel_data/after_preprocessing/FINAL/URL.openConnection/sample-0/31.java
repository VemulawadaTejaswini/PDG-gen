public class func{
public void isPutIntoOven(){
            final URL url = new URL("https:
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int inOven = connection.getResponseCode();
}
}
