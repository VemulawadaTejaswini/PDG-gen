//96
public class func{
public void getUrlAsStream(String urlString){
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    return conn.getInputStream();
}
}
