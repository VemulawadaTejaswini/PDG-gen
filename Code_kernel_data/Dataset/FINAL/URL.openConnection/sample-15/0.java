public class func{
public void openURLConnection(URL url){
        URLConnection con = url.openConnection();
        con.setConnectTimeout(TIMEOUT);
        con.setReadTimeout(TIMEOUT);
}
}
