//87
public class func{
	public void changeQuery(URI uri,String newQuery){
    return create(uri.getScheme(), getCorrectAuthority(uri), uri.getPath(), newQuery, uri.getFragment());
}
}
