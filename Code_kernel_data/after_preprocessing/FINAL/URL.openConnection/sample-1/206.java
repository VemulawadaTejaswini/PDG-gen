public class func{
public void validateAndUpdateURL(String strURL){
        URL url = new URL(strURL);
        URLConnection conn = url.openConnection();
        conn.connect();
}
}
