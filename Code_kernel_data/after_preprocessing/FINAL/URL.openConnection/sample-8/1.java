public class func{
public void read(final URL url){
        final URLConnection connection = url.openConnection();
        final int contentLength = connection.getContentLength();
        if (contentLength < 0) {
            throw new FileNotFoundException(url.getFile());
        }
        final InputStream stream = connection.getInputStream();
            read(stream);
            if (stream != null) {
                stream.close();
            }
}
}
