//307
public class func{
public void connectTo(String endpoint){
        URL url = new URL(endpoint);
        return (HttpURLConnection) url.openConnection();
}
}
