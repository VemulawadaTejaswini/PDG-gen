//12
public class func{
public void read(final URL url){
        final URLConnection connection = url.openConnection();
        final int fileSize = connection.getContentLength();
        if (fileSize < 0) {
            throw new FileNotFoundException(url.getFile());
        }
        read(url.openStream());
}
}
