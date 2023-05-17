//2
public class func{
public void readClassFile(Class<?> templateClass){
        String templateName = templateClass.getName();
        int lastDot = templateName.lastIndexOf('.');
        java.net.URL url = templateClass.getResource(templateName.substring(lastDot+1)+".class");
        java.net.URLConnection connection = url.openConnection();
        int contentLength = connection.getContentLength();
        if (contentLength < 0)
            throw new IOException("invalid content length "+contentLength);
        return IOUtils.readFully(connection.getInputStream(), contentLength, true);
}
}
