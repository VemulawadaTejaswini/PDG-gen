public class func{
public void getUrlContent(URL u){
    java.net.URLConnection c = u.openConnection();
    c.connect();
}
}
