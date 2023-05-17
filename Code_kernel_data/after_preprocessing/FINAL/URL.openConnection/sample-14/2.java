public class func{
public void readNonCaching(final URL url){
    Args.notNull(url, "url");
    URLConnection urlConnection = url.openConnection();
    urlConnection.setUseCaches(false);
    InputStream inputStream = urlConnection.getInputStream();
}
}
