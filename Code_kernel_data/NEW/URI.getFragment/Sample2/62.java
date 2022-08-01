//61
public class func{
	public void changePort(URI uri,int newPort){
    return create(uri.getScheme(), uri.getUserInfo(), uri.getHost(), newPort, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
