public class func{
public void downloadInputStream(String url2get,Object lock,String UserAgent){
    java.net.URLConnection urlConnect = new URL(url2get).openConnection();
    urlConnect.setRequestProperty("User-Agent", UserAgent);
    InputStream iStream = new BufferedInputStream(urlConnect.getInputStream());
}
}
