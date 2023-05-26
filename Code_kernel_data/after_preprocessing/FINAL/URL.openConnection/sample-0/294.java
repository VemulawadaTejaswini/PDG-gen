public class func{
public void setupConnection(String url,String authHeaderValue){
        logger.debug("Intitiating connection to URL: " + url);
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
}
}
