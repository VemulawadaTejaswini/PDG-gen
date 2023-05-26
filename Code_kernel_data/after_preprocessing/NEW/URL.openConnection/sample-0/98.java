//98
public class func{
public void httpRequest(String urlStr,String requestType){
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(requestType);
            return con.getResponseCode();
}
}
