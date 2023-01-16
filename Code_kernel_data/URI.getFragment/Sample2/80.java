//79
public class func{
	public void changeAuthority(URI uri,String newAuthority){
    return create(uri.getScheme(), newAuthority == null ? "" : newAuthority, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
