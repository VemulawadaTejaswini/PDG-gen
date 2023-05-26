//71
public class func{
public void callback(HttpDownloader downloader,URI uri,String query){
    uri = new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(),
        uri.getPath(), query, uri.getFragment());
}
}
