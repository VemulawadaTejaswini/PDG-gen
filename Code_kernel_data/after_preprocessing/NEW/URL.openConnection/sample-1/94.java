//94
public class func{
public void downloadAndStoreImage(String urlString){
        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        InputStream in = conn.getInputStream();
}
}
