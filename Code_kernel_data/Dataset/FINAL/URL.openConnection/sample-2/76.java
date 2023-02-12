public class func{
public void UrlExternalResource(URI uri,URL url){
        connection = url.openConnection();
        metaData = new DefaultExternalResourceMetaData(uri, connection.getLastModified(), connection.getContentLength(), connection.getContentType(), null, null);
}
}
