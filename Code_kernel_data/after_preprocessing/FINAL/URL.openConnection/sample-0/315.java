public class func{
public void buildConnection(RequestMethod requestMethod,String urlString){
        URL url = new URL(configuration.getBaseURL() + urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
}
}
