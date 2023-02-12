public class func{
public void enableSynchronization(URI uri){
    return new URI(scheme, uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
