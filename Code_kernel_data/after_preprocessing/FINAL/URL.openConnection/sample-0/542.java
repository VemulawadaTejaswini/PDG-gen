public class func{
public void getArchiveReader(final URL f,final long offset){
        URLConnection connection = f.openConnection();
        if (connection instanceof HttpURLConnection) {
          addUserAgent((HttpURLConnection)connection);
        }
}
}
