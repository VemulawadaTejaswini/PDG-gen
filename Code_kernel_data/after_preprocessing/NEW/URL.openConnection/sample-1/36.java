//36
public class func{
public void getURL(String sUrl){
    URL url = new URL( sUrl );
    URLConnection urlConnection = url.openConnection();
    urlConnection.setConnectTimeout(1000);
    urlConnection.setReadTimeout(30000);
    return new InputStreamReader( urlConnection.getInputStream() );
}
}
