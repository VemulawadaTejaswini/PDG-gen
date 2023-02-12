public class func{
public void load(URL url){
            HttpURLConnection c = (HttpURLConnection) url.openConnection();
            c.setConnectTimeout(2000);
            c.connect();
            String headerField = c.getHeaderField(0);
            return headerField.endsWith("200 OK");
}
}
