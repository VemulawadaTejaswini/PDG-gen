public class func{
public void changeHost(URI uri,String newHost){
    return create(uri.getScheme(), uri.getUserInfo(), newHost, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
