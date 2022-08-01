//57
public class func{
	public void urlFromSocket(URI uri,ServerSocket serverSocket){
    return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(),
        listenPort, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
