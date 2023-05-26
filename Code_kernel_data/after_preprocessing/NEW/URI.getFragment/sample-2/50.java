//50
public class func{
public void buildUri(String relativePath){
        uri = new URI(uri.getScheme(), uri.getUserInfo(), host, uri.getPort(), uri.getPath(), uri.getQuery(),
            uri.getFragment());
}
}
