public class func{
public void bind(){
        URI boundUri = new URI(bind.getScheme(), bind.getUserInfo(), host, bindAddress.getPort(), bind.getPath(), bind.getQuery(), bind.getFragment());
        setConnectURI(boundUri);
}
}
