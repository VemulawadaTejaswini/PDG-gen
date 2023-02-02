//301
public class func{
public void checkLatest(String urlPath,String localPath){
    URL url = new URL(urlPath);
    URLConnection conn = url.openConnection();
    long latest = conn.getLastModified();
}
}
